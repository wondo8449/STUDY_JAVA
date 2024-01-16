package exceptionTest;

import java.util.Iterator;
import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
	
		int[] arData = new int[5];
		Scanner sc = new Scanner(System.in);
		String msg = "번째 정수 : ", temp = null;
		int index = 0;
		
		while(true) {
			System.out.print(++index + msg);
			temp = sc.next();
			if(temp.equals("q")) {break;}
			
			try {
				arData[index - 1] = Integer.parseInt(temp);
			} catch (NumberFormatException e) {
				System.out.println("제대로 입력하세요.");
				index--;
			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println(e);
				System.out.println("5개만 입력하세요");
				for (int i = 0; i < arData.length; i++) {
					System.out.print(arData[i] + " ");
				}
				break;
			} catch (Exception e) {
				System.out.println("뭔가 잘못되었습니다.");
			}
		}
}
}
