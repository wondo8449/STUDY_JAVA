package anonymous;

import java.lang.reflect.InaccessibleObjectException;

public class AnonymousTest {
	public static void main(String[] args) {
		//업캐스팅
		Inter i = new Inter() {
			
			@Override
			public void printData() {
				
			}
		};
	}
}
