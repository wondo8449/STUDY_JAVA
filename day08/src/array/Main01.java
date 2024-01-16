package array;

public class Main01 {
	public static void main(String[] args) {
		// 성적표에 대한 2차 배열 생성
		//총점과 평균까지 구하기
		int[][] grade = { {75, 82, 91}, {88, 64,50}, {100, 100, 90} };
		
		for( int i =0; i < grade.length; i++) {
			// 반복문 안에서 선언된 변수는 매 실행시마다 새로 생성이 된다.
			int sum = 0;
			int avg = 0;
			
			for( int j = 0; j < grade[i].length; j++ ) {
				sum += grade[i][j];
				avg = sum / grade[i].length;
			}
	
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
		}
	}
}
