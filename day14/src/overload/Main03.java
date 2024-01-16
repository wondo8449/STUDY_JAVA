package overload;

public class Main03 {
	public static void main(String[] args) {
		Article a1 = new Article(1);
		System.out.println(a1);
		
		Article a2 = new Article(2, "테스트 게시물");
		System.out.println(a2);
		
		Article a3 = new Article(2, "두번째 게시물", "자바학생");
		System.out.println(a3);		
	}
}
