package view;

import java.text.ParseException;

import dao.UserDAO;
import vo.UserVO;

public class Test {
	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
//		연결 확인
//		Connection connection = DBConnecter.getConnection();
//		
//		try {
//			connection.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
//		아이디 중복검사
//		if(userDAO.checkId("hds1234")) {
//			System.out.println("중복된 아이디");
//		} else {
//			System.out.println("사용 가능한 아이디");
//		}
//		
//		회원가입
//		UserVO userVO = new UserVO();
//		userVO.setUserId("hgd");
//		userVO.setUserPassword("3333");
//		userVO.setUserRecommenderID("kyc");
//		userVO.setUserGender("M");
//		userVO.setUserName("홍길동");
//		userVO.setUserPhoneNumber("01011112222");
//		
//		userDAO.join(userVO);
		
//		로그인
//		System.out.println(userDAO.login("KYC", "1234"));
		
//		회원정보 수정
//		UserVO userVO = userDAO.findByUserNumber(userDAO.login("KYC", "1234"));
//		userVO.setUserBirthday(null);
//		userDAO.update(userVO);
	
//		아이디 찾기
//		System.out.println(userDAO.findByUserPhoneNumber("01012341234"));
		
//		비밀번호 변경
//		userDAO.updateUserPassword("KYC", "6504");
//		System.out.println(userDAO.login("KYC", "6504"));
		
//		회원탈퇴
//		userDAO.delete(userDAO.login("hgd", "3333"));
		
//		추천수
//		System.out.println(userDAO.getRecommenderCount("kyc"));
		
//		나를 추천한 사람
//		userDAO.getRecommendedUsers("kyc").forEach(System.out::println);
		
//		내가 추천한 사람
//		System.out.println(userDAO.getRecommender("kyc"));
	}
}
