package variable;

public class FormatTest {

	public static void main(String[] args) {
		int age = 20;
		String name= "김예찬";
		double weight = 74.2;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d살\n", age);
		System.out.printf("몸무게 : %.1fkg", weight);
	}

}
