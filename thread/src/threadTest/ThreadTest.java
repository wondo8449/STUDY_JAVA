package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		
		Thread2 t1 = new Thread2();
		Thread2 t2 = new Thread2();
		
		Thread thread1 = new Thread(t1, "?");
		Thread thread2 = new Thread(t2, "!");
		
		thread1.start();
		thread2.start();
		
		try {
//			join(): 사용한 쓰레드가 다 끝나야 다른 쓰레드가 동작한다
			thread1.join();
			thread2.join();
		} catch (Exception e) {;}
		
		System.out.println("메인 메소드 종료");
		
//		Thread1 t1 = new Thread1("가");
//		Thread1 t2 = new Thread1("나");
//		
//		t1.start();
//		t2.start();
	}
}