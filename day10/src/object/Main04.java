package object;

import java.util.Scanner;

class Calc {
	
	int plus(int x, int y) {
		return x+y;
	}
	
	int minus(int x, int y) {
		return x - y;
	}
	
	int times(int x, int y) {
		return x * y;
	}
	
	int divide(int x, int y) {
		int result = 0;
		if( y != 0 ) {
			result = x / y;
		}
		return result;
	}
}

public class Main04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Calc c3 = new Calc();
		
		String num1 = "null", num2 = "null";
		
		System.out.println("두 정수를 입력해주세요 : ");
		
		num1 = sc.next();
		num2 = sc.next();
		
		System.out.println(c3.plus(Integer.parseInt(num1),Integer.parseInt(num2)));
//		System.out.println(c3.minus(10,5));
//		System.out.println(c3.times(10,5));
//		System.out.println(c3.divide(10,5));
	}
}
