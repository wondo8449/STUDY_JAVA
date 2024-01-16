package syncronized;

public class BreadPlate {
	private static BreadPlate breadPlate;
	
	public int breadCount;
	public int eatCount;
	
	private BreadPlate() {;}
	
//	싱글톤 패턴
//	무조건 객체가 단 한 개만 있어야 할 때의 설계 방법
	public static BreadPlate getInstance() {
		if(breadPlate == null) {
			breadPlate = new BreadPlate();
		}		
		return breadPlate;
	}
	
	public synchronized void makeBread() {
		if(breadCount > 9) {
			System.out.println("빵이 가득 찼습니다.");
			try {wait();} catch (InterruptedException e) {;}
		}
		breadCount++;
		System.out.println("빵을 1개 만들었습니다. 총 :" + breadCount + "개");
	}
	
	public synchronized void eatBread() {
		if(eatCount == 20) {
			System.out.println("빵이 다 떨어졌습니다.");
		} else if(breadCount < 1) {
			System.out.println("🥯빵을 만들고 있어요");
		} else {
			breadCount--;
			eatCount++;
			System.out.println("빵을 1개 먹었습니다. 총 :" + breadCount + "개");
			notify();
		}
	}
}
