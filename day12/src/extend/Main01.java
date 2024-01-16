package extend;

public class Main01 {
	public static void main(String[] args) {
		
		CalcParent parent = new CalcParent();
		System.out.println(parent.plus(10,20));
		
		CalcChild child = new CalcChild();
		System.out.println(child.plus(20, 30));
		System.out.println(child.minus(20, 10));
		System.out.println(child.divide(10, 2));
	}
}
