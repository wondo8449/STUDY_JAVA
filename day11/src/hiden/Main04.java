package hiden;

public class Main04 {
	public static void main(String[] args) {
		Article a = new Article(1, "제목", "내용", "작성자", 1, "작성일시");
		
		System.out.println(a.getSeq());
		System.out.println(a.getSubject());
		System.out.println(a.getContent());
		System.out.println(a.getWriter());
		System.out.println(a.getHit());
		System.out.println(a.getRegData());
	}
}
