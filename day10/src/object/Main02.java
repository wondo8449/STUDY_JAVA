package object;

class Clac {
	int plus(int x, int y) {
		return x+y;
	}
	
	int minus(int x, int y) {
		return x -y;
	}
}

public class Main02 {
	public static void main(String[] args) {
		Clac c1 = new Clac();
		System.out.println(c1.plus(10, 20));
		
		//c2는 굳이 필요 없음
		Clac c2 = new Clac();
		System.out.println(c2.plus(100, 200));
		
		System.out.println(c1.minus(10, 5));
		
		//파라미터에 의해 결과를 리턴하는 경우 서로 다른 값을 위하여 객체를 여러개 생성할 필요가 없다
		//자체적으로 데이터를 갖는 형태가 아니라 외부적 요인인 파라미터에 의해서 결과가 생성되므로
		//하나의 객체를 재사용하는 것이 바람직하다
	}
}
