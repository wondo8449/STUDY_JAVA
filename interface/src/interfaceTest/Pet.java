package interfaceTest;

public interface Pet {
	
	//final static  생략 가능
	final static int eyes = 2;
	int nose = 1;
	
	//abstract 생략 가능
	abstract void sitDown();
	void stop();
	void poop();
	void bang();
}
