package override;

class Hello {
	public void say() {
		System.out.println("Hello");
	}
}

class English extends Hello { }

class Korean extends Hello {
	public void say() {
		System.out.println("안녕하세요");
	}
 }

public class Main01 {
	public static void main(String[] args) {
		English eng = new English();
		Korean kor = new Korean();
		eng.say();
		kor.say();
	}
}
