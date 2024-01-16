package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CustomerDAO;
import dao.DBConnector;
import vo.CustomerVO;

public class CustomerView {
	public static void main(String[] args) {
		CustomerDAO customerDAO = new CustomerDAO();
//		try {
//			Connection connection = DBConnector.getConnection();
//			connection.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
//		아이디 중복검사
//		if(customerDAO.checkId("kyc")) {
//			System.out.println("중복된 아이디");
//		} else {
//			System.out.println("사용 가능한 아이디");
//		}
		
//		회원가입
//		CustomerVO customerVO = new CustomerVO();
//		customerVO.setCustomerId("hgd");
//		customerVO.setCustomerPassword("6504");
//		customerVO.setCustomerName("홍길동");
//		customerVO.setCustomerAge(30);
//		customerVO.setCustomerPhoneNumber("01011112222");		
//		
//		customerDAO.join(customerVO);
		
//		로그인
	}
}
