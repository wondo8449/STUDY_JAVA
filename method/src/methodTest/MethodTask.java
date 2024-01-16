package methodTest;

public class MethodTask {
	/*
	 * 1. 메소드명을 정한다
	 * 2. 매개변수를 생각한다
	 * 3. 실행할 문장을 작성한다
	 * 4. 리턴값을 작성한다
	 * 5. 리턴타입을 결정한다
	 */
	//문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
	int getCount(String str, char c) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				count ++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		System.out.println(mt.getCount("apple", 'p'));
	}
}
