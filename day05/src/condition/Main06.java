package condition;

public class Main06 {
	public static void main(String[] args) {
		String grade = "C";
		
		switch ( grade ) {
			case "A" :
				System.out.println("91~100점 사이");
				break;
			case "B" :
				System.out.println("81~90점 사이");
				break;
			case "C" :
				System.out.println("71~80점 사이");
				break;
			default :
				System.out.println("70점 이하");
				break;
		}
	}
}
