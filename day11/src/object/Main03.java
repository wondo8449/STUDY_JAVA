package object;

class Article {
	int seq;				//글번호
	String subject;	//글제목
	String writer;		//작성자
	
	//글번호, 글제목, 작성자를 파라미터로 받아와서
	//전역변수 각각에 값을 할당해주는 파라미터가 있는 생성자 작성
	
	Article( int seq, String subject, String writer ) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	//print(), 전역변수 각각을 출력
	
	void Print() {
		System.out.println(this.seq);
		System.out.println(this.subject);
		System.out.println(this.writer);
	}
}

public class Main03 {
	public static void main(String[] args) {
		Article art = new Article(1, "제목", "작성자");
		art.Print();
	}
}
