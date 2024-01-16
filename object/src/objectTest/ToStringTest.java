package objectTest;

import java.util.Random;

class Student {
	public String toString() {
		return "학생입니다";
	}
}

public class ToStringTest {
	public static void main(String[] args) {
		
		Student std = new Student();
		System.out.println(std.toString());
	}
}
