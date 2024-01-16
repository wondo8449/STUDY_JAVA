package objectTest;

import java.util.Random;

public class EqualsTest {
	public static void main(String[] args) {
		
		String data1 = "ABC"; //같은 주소
		String data2 = "ABC";
		
		String data3 = new String("ABC"); //생성자를 통해 생성되어서
		String data4 = new String("ABC"); //다른 주소값을 배정받는다
		
		System.out.println(data1 == data2);		//true 주소비교
		System.out.println(data1.equals(data2));	//true 값비교
		
		System.out.println(data3 == data4);		//false 주소비교
		System.out.println(data3.equals(data4));	//true 값비교
		
		
		
//		Random r1 = new Random();
//		Random r2 = new Random();
//		
//		System.out.println(r1);
//		System.out.println(r2);
//		
//		System.out.println(r1 == r2);
//		System.out.println(r1.equals(r2));
//		
//		r1 = r2;
//		
//		System.out.println(r1 == r2);
//		System.out.println(r1.equals(r2));
	}
}
