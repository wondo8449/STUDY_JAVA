package condition;

public class Main08 {
	public static void main(String[] args) {
		String grade = "D";
		
		switch( grade ) {
			case "A" :
			case "B" :
			case "C" :
				System.out.println("PASS");
				break;
			default :
				System.out.println("NOT PASS");
				break;
		}
	}
}
