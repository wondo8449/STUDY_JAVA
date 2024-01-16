package override;

class Hi {
	public void say() {
		System.out.println("HI");
	}
}

class Korean2 extends Hi {
	public void say() {
		//super 키워드를 사용하여 부모의 메서드를 호출한 뒤에 추가적인 기능을
		//정의하고 있으므로 부모의 원본 메서드에 대한 기능 확장 효과가 있다
		super.say();
		System.out.println("안녕하세요");
	}
	
	public void sayHello() {
		super.say();
		this.say();
	}
}

public class Main02 {

	public static void main(String[] args) {
		Korean2 ko = new Korean2();
//		ko.sayHello();
		ko.say();
	}

}
