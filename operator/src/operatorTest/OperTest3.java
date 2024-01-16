package operatorTest;

import java.util.Scanner;

public class OperTest3 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		삼항 연산자를 반드시 사용한다.
		
		int height = 0, result = 0;
		String message = "키를 입력해주세요.";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		height = sc.nextInt();
		
		
		
		result = height;
		
		System.out.println(result);
		
		
		
	}
}
