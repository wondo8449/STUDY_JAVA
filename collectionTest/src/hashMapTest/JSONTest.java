package hashMapTest;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONTest {
	public static void main(String[] args) {
		HashMap<String , Object> userMap = new HashMap<>();
		
		JSONArray userJsons = new JSONArray();
		
		JSONObject userJson = null;
		
		userMap.put("id", "kyc");
		userMap.put("password", "1234");
		userMap.put("name", "김예찬");
		userMap.put("age", 20);
		
		userJson = new JSONObject(userMap);
		
//		userJson.put("phoneNumber", "01099408245");
		
		
		System.out.println(userJson);
	}
}
