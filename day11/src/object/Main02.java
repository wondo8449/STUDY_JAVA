package object;

class User {
	
	String name;
	int age;
	
	User( String name, int age ) {
		//생성자 파라미터 값을 멤버변수에 복사
		this.name = name;
		this.age = age;
	}
	
	void print() {
		System.out.println(this.age);
		System.out.println(this.name);
	}
}
public class Main02 {
	public static void main(String[] args) {
		User user = new User("자바학생", 20);
		user.print();
	}
}
