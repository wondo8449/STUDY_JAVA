package multiex;

public class Main02 {
	public static void main(String[] args) {
		//1부터 100까지 홀수와 짝수의 합을 각각 구하여라
		//단 continue, break 사용금지, 반복문 1개만
		
		int sum1 = 0;
		int sum2 = 0;
		
		for ( int i = 0; i <= 100; i++ ) {
			if ( i % 2 == 0) {
				sum1 += i;
			} else {
				sum2 += i;
			}
		}
		
		System.out.println("짝수의 합 : " + sum1 + " " + "홀수의 합 : " + sum2);
		
		//만약 3000원 이상의 돈을 가지고 있으면 택시를타고 아니면 걸어가라
		int money = 2000;
		
		if ( money >= 3000 ) {
			System.out.println("택시를 타라");
		} else {
			System.out.println("걸어가라");
		}
		
		//만약 3000원 이상의 돈이 있거나 카드나 있다면 택시를 타고 아니면 걸어가라
		boolean card = false;
		
		if ( money >= 3000 ) {
			System.out.println("택시를 타라");
		} else if ( card == true ) {
			System.out.println("택시를 타라");
		} else {
			System.out.println("걸어가라");
		}
		
		//특정 정수값 a,b,c의 최대값을 구하여라
		// a=10, b=20, c=9
		int a = 10, b = 20, c = 9;
		
		if ( a > b && a > c ) {
			System.out.println(a);
		} else if ( a < b && b > c  ) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		
		//3이면 안녕 3줄, 2면 2줄, 1이면 1줄, 그 외에는 잘가 출력
		int d = 4;
		
		if ( d == 3 ) {
			System.out.println("안녕");
			System.out.println("안녕");
			System.out.println("안녕");
		} else if ( d ==2 ) {
			System.out.println("안녕");
			System.out.println("안녕");
		} else if ( d == 1 ) {
			System.out.println("안녕");
		} else {
			System.out.println("잘가");
		}
		
	}
}
