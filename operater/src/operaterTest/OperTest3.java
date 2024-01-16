package operaterTest;

import java.util.Scanner;

public class OperTest3 {

	public static void main(String[] args) {
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		삼항연산자를 반드시 사용한다
		
		double height = 0;
		boolean check = false;
		String format = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사용자의 키를 입력해주세요 : ");
		
		height = sc.nextDouble();
		
		check = height - (int)height == 0;
		
		format  = check ? "%.0fcm" : "%.2fcm";
		
		System.out.printf(format, height);
	}

}
