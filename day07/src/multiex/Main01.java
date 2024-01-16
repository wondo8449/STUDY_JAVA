package multiex;

public class Main01 {
	public static void main(String[] args) {
		
		int sum =0;
		int i =0;
		
		while (true)	{
			i++;
			
			// 짝수를 제거
			if (i % 2 == 0 ) {
				continue;
			}
			if( i > 100 ) {
				break;
			}
			
			sum += i;
			
		}
		
		System.out.println(sum);
	}
}
