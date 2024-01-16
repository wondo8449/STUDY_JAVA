package hiden;

class Student {
	private String name = "자바학생";
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if( age >= 0 ) {
			this.age = age;
		} else {
			this.age = 0;
		}
	}
	
}

public class Main02 {
	public static void main(String[] args) {
		Student std = new Student();
		std.setAge(20);
		std.setName("자바학생");
		
		System.out.println("나이 : " + std.getAge());
		System.out.println("이름 : " + std.getName());
	}
}
