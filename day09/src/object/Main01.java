package object;

class Student {
	 
	String name = "null";
	int age = 20;
}

public class Main01 {
	
	public static void main(String[] args) {
		//객체의 선언과 할당 분리
		Student std;
		std = new Student();
		
		System.out.println(std.age);
		
		std.name = "jsp학생";
		System.out.println(std.name);
		
		//일괄지정
		Student std2 = new Student();
		System.out.println(std2.name);
		
	}
}
