package object;

class Charactor {
	//일반적으로 멤버변수는 선언만 한다.
	String name;
	String job;
}
public class Main02 {
	public static void main(String[] args) {
		Charactor d = new Charactor();
		d.name = "둘리";
		d.job = "학생";
		
		Charactor h = new Charactor();
		h.name = "희동";
		h.job = "직장인";
	}
}
