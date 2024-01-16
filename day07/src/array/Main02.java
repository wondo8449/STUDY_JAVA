package array;

public class Main02 {
	public static void main(String[] args) {
		
		int[] dooly = { 75, 82, 91 };
		int[] douneo = { 88, 64, 50 };
		int[] ddochy = { 100, 100, 90 };
		
		int sum1 = 0, sum2 = 0, sum3 = 0;
		
		for (int i =0; i < dooly.length; i++) {
			sum1 += dooly[i];
		}
		
		for (int i =0; i < douneo.length; i++) {
			sum2 += douneo[i];
		}
		
		for (int i =0; i < ddochy.length; i++) {
			sum3 += ddochy[i];
		}
		
		System.out.println("둘리의 평균 : " + sum1 / dooly.length);
		System.out.println("도우너의 평균 : " + sum2 / douneo.length);
		System.out.println("또치의 평균 : " + sum3 / ddochy.length);
	}
}
