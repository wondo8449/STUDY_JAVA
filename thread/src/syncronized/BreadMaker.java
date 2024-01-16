package syncronized;

public class BreadMaker implements Runnable {

	BreadPlate breadPlate = BreadPlate.getInstance();
	
	@Override
	public void run() {
		int i = 0;
		for (i = 0; i < 20; i++) {
			breadPlate.makeBread();
			try {Thread.sleep(1000);} catch (Exception e) {break;}
		}
		if(i != 20) {
			System.out.println("안녕히 가세요");
		} else {
		System.out.println("재료소진"); }
	}
}
