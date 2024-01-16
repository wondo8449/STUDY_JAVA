package operatorTest;

import java.util.Scanner;

public class OperTest2 {
	public static void main(String[] args) {
// 두 정수 입력
		int a = 0, b =0;
		boolean isBigger = false, isSame = false;
		String message = "두 정수를 입력하세요.", result = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		a = sc.nextInt();
		b = sc.nextInt();
		
		isBigger = a > b;
		isSame = a == b;
		
		result = isBigger ? "큰 값 : " + a : isSame ? "두 수는 같습니다." : "큰 값 : " + b;
		
		System.out.println(result);
	}
}