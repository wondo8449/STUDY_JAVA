package lambdaTest;

public class PrintNameTest {
	public static void printFullName(PrintName printName) {
		System.out.println(printName.getName("김", "예찬"));
	}
	
	public static void main(String[] args) {
		//람다식을 매개변수로 전달해라!
		printFullName((f, s) -> f + s);
	}
}
