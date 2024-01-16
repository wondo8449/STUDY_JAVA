package object;

class Book {
	String subject;
	String content;
	
	Book() {
		System.out.println("생성자가 실행됨");
		this.subject = "JAVA입문";
		this.content = "객체지향";
	}
	
	void read() {
		System.out.println("read 실행됨");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
}

public class Main01 {

	public static void main(String[] args) {
		Book book = new Book();
		book.read();
	}

}
