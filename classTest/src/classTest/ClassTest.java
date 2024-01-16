package classTest;

class Car {
	String brand;
	
	public Car(String brand) {
		this.brand = brand;
	}

	void engineStart() {
		System.out.println(this);
		System.out.println(this.brand + "시동킴");
	}
}
public class ClassTest {
	public static void main(String[] args) {
		Car mom = new Car("benz");
		Car dad = new Car("bmw");
		
		System.out.println(dad);
		dad.engineStart();
		
		System.out.println(mom);
		mom.engineStart();
	}
	
}
