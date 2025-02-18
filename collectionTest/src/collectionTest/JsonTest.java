package collectionTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "kys3189");
		userMap.put("password", "1234");
		userMap.put("name", "김영수");
		userMap.put("age", 20);
		
//		json으로 바꾸기 json-simple.jar를 미리 임포트해야함
		JSONObject json = new JSONObject(userMap);
		System.out.println(json);
	}
}
