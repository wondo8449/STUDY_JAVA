package castingTest;

import java.util.Iterator;

public class Encryption {
	public static void main(String[] args) {
		String password = "dpcksdl";
		String encryptedPassword ="";
		String dencryptedPassword ="";
		final int KEY = 3;
		
		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char)(password.charAt(i) * KEY);			
		}
		
		System.out.println(encryptedPassword);
		
		for (int i = 0; i < encryptedPassword.length(); i++) {
			dencryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);			
		}
		
		System.out.println(dencryptedPassword);
		
		
	}
}
