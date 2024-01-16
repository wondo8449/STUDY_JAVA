package hashMapTest;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
//	
		HashMap<String , Object> userMap = new HashMap<>();
		
		userMap.put("id", "kyc");
		userMap.put("password", "1234");
		userMap.put("name", "김예찬");
		userMap.put("age", 20);
		
		System.out.println(userMap);
		
		System.out.println(userMap.get("id"));
		userMap.put("name", "홍길동");
		System.out.println(userMap);
	}
}
