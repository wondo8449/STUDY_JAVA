package variableTest;

public class FoamatTest {
	public static void main(String[] args) {
		String name = "김예찬";
		int age = 27;
		double weight = 75;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d살\n", age);
		System.out.printf("몸무게 : %.2fkg\n", weight);
	}
}
