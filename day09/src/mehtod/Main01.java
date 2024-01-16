package mehtod;

public class Main01 {
	public static void main(String[] args) {
		plus(1,2);
		minus(5,4);
		
		System.out.println(plus(1,2));
		System.out.println(minus(5,4));
		//메서드간의 상호호출 가능
		System.out.println(f(10,20));
	}
	
	public static int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	public static int minus(int x, int y) {
		return x - y;
	}
	
	public static int f(int x, int y) {
		return  plus(x, y);
	}
}