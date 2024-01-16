package operaterTest;

import java.util.Scanner;

public class OperTest2 {

	public static void main(String[] args) {
//		두 정수 입력
		Scanner sc = new Scanner(System.in);
		int firstnum = 0, secondnum = 0;
		boolean isBigger = false, isSame = false;
		String result ="null";
		
		System.out.println("두 정수를 입력해주세요 : ");
		firstnum = sc.nextInt();
		secondnum = sc.nextInt();
		
		isBigger = firstnum > secondnum;
		isSame = firstnum == secondnum;
		
		result = isBigger ? "큰값: " + firstnum : isSame ? "두 수는 같습니다." : "큰값: " + secondnum;
				
		System.out.println(result);
	}

}
