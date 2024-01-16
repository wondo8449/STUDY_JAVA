package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.CustomerVO;

public class CustomerDAO {
	
	private static final int customerNumer_1 = -1; // 탈퇴한 회원
	private static final int customerNumer_2 = 0; // 가입한 회원
	private static final int customerNumer_3 = 1;
	
	public Connection connection;
	public PreparedStatement preparedStatement;
	public ResultSet resultSet;
	
//	아이디 중복검사
	public boolean checkId(String customerId) {
		String query = "select count(customer_id) from tbl_customer where customer_id = ?";
		boolean check = false;
		try {
			connection = DBConnector.getConnection();
			preparedStatement =connection.prepareStatement(query);
			preparedStatement.setString(1, customerId);
			resultSet = preparedStatement.executeQuery();
			
			resultSet.next();
			
			check = resultSet.getInt(1) == 1;
			
		} catch (SQLException e) {
			System.out.println("checkId() SQL문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(preparedStatement != null ) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
		return check;
	}
//	회원가입(핸드폰 번호 1개당 3번의 회원가입 가능)
	public void join(CustomerVO customerVO) {
		String query = "insert into tbl_customer (customer_id, customer_password, customer_name, customer_age, customer_phone_number)"
				+ "values(?, ?, ?, ?, ?)";
		try {
			connection = DBConnector.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, customerVO.getCustomerId());
			preparedStatement.setString(2, customerVO.getCustomerPassword());
			preparedStatement.setString(3, customerVO.getCustomerName());
			preparedStatement.setInt(4, customerVO.getCustomerAge());
			preparedStatement.setString(5, customerVO.getCustomerPhoneNumber());
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("join() SQL문 오류");
			e.printStackTrace();
		} finally {
			try {
				if(preparedStatement != null ) {
					preparedStatement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	} 
//	로그인
//	아이디 찾기
//	회원정보 전체 수정
//	회원 1명 전체 정보 조회
//	회원탈퇴
//	회원탈뢰 복구
//	핸드폰 번호로 가입한 전체 회원 정보 조회
}
