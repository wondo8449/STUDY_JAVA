package inputTest;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		// 두 정수를 입력받은 뒤 덧셈 결과를 출력
		// 단, next()만 사용한다.
		
		String firstNumber = "null", secondNumber = "null";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수를 입력해주세요 :");
		
		firstNumber = sc.next();
		secondNumber = sc.next();
		
		System.out.println(Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber));
		
	}
}
