package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		세 정수를 한 번에 입력받고, 곱의 결과를 출력
//		next()만 사용
		Scanner sc = new Scanner(System.in);
		String firstNumber = "null", secondNumber = "null", thirdNumber = "null";
		
		System.out.print("세 정수를 입력해주세요 :");
		firstNumber = sc.next();
		secondNumber = sc.next();
		thirdNumber = sc.next();
		
		System.out.println( Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber) * Integer.parseInt(thirdNumber));
	}
}
