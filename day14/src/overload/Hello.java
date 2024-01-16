package overload;

public class Hello {

		public Hello(String msg) {
			System.out.println(msg);
		}
		
		public Hello() {
			this("Hello");
		}
}
