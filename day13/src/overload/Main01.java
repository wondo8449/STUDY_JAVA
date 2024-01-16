package overload;

public class Main01 {
	public static void main(String[] args) {
		Charactor c =new Charactor();
		
		c.setProperty(19);
		System.out.println(c.toString());
		
		c.setProperty("개발자");
		System.out.println(c.toString());
		
		c.setProperty("자영업", 20);
		System.out.println(c.toString());
		
		c.setProperty(30, "교수");
		System.out.println(c.toString());
	}
}
