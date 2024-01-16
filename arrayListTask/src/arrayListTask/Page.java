package arrayListTask;

public class Page {
	public static void main(String[] args) {
		UserField userField = new UserField();
		User user = new User();
		user.setId("hds1234");
		user.setPassword("1234");
		user.setName("한동석");
		user.setPhoneNumber("01012341234");
		
		if(userField.checkId(user.getId()) == null) {
			userField.join(user);
			System.out.println("회원가입 성공");
		}
		
		userField.users.forEach(System.out::println);
		
		if(userField.login("hds1234", "1234")) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
	}
}
