package object;

class HelloWorld {
	//전역변수(멤버변수) -> 범위는 클래스 내부 전역
	String message;
	
	void sayHello() {
		System.out.println(message);
	}
	
	void setEng() {
		message = "Hello Java";
	}
	
	void setKor() {
		message = "안녕하세요 자바";
	}
}

public class Main01 {
	public static void main(String[] args) {
		
		HelloWorld hello = new HelloWorld();
		
		//메서드 호출
		hello.setEng();
		hello.sayHello();
		
		hello.setKor();
		hello.sayHello();
		
		hello.sayHello();
	}
}
