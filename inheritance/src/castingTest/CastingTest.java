package castingTest;

class Car {
	void engineStart() {
		System.out.println("열쇠 또는 버튼으로 시동 킴");
	}
}

class SuperCar extends Car {
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void openRoof() {
		System.out.println("지붕 염");
	}
}

public class CastingTest {
	public static void main(String[] args) {
		
		Car matiz = new Car();
		//up Casting
		Car noOptionFerrari = new SuperCar();
		
		noOptionFerrari.engineStart();
		//오류
		//SuperCar brokenFerrari = (SuperCar)new Car();
		
		//down casting
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
		
		//matiz instanceof Car :
		System.out.println(matiz instanceof Car);
		//matiz instanceof SuperCar :
		//ferrari instanceof Car :
		//ferrari instanceof SuperCar :
		//noOptionferrari instanceof SuperCar :
		
	}
}
