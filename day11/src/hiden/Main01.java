package hiden;

class User {
	public String name = "사용자";
	private int age = 20;
}

public class Main01 {

	public static void main(String[] args) {
		User user = new User();
		System.out.println(user.name);
		//System.out.println(user.age); // private라서 접근 불가
	}

}
