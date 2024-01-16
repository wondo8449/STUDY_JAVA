package arrayListTask;

import java.util.ArrayList;

public class UserField {
	private final static int KEY = 3;
	
	public ArrayList<User> users = new ArrayList<User>();
	
//	아이디 중복검사 메소드
	public User checkId(String id) {
		User temp = null;
		
//		DB에 있는 회원을 전부 가져와서 하나씩 user에 담는다.
		for (User user : users) {
//			각 회원의 아이디와 입력한 아이디를 비교한다
			if(user.getId().equals(id)) {
//				일치하는 아이디가 있다면 그 회원을 temp에 담아준다.
				temp = user;
			}
		}
//		아이디가 있으면 해당 회원 객체 리턴,
//		없으면 null 리턴
		return temp;
	}
	
//	회원가입 메소드
//	외부에서 입력한 회원의 전체 정보를 전달받는다
	public void join(User user) {
//		비밀번호를 암호화안 뒤 DB에 저장한다
		user.setPassword(encrypt(user.getPassword()));
		users.add(user);
	}
	
//	로그인 메소드
//	사용자가 입력한 아이디와 비밀번호를 전달받는다
	public boolean login(String id, String password) {
//		아이디를 검사한다
		User user = checkId(id);
//		만약 user가 null이 아니라면 DB에 존재하는 아이디이다.
		if(user != null) {
//			해당 회원의 비밀번호를 가져와서 입력한 비밀번호와 비교한다
//			암호화된 것 끼리 비교
			if(user.getPassword().equals(encrypt(password))) {
//				로그인 성공
				return true;
			}
		}
//		로그인 실패
		return false;
	}
	
//	암호화
	public String encrypt(String password) {
		String encryptPassword = "";
		
		for (int i = 0; i <password.length(); i++) {
			encryptPassword += (char)(password.charAt(i) * KEY);
		}
		
		return encryptPassword;
	}
}
