package colloctionTest.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
//		<>안에 키 : 밸류를 넣는다, 밸류가 오브젝트인 이유는 모든값을 넣는(최상위 부모) 오브젝트타입을 넣기 위해.
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "kys3189");
		userMap.put("password", "1234");
		userMap.put("name", "김영수");
		userMap.put("age", 25);
		
//		System.out.println(userMap.size());
//		System.out.println(userMap);
//		System.out.println(userMap.get("id"));
		
//		키, 밸류를 엔트리타입으로 묶어서 set자료구조에 보관
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator();
		
//		entry : key, value를 한 쌍씩 가지고 있는 자료구조
//		entrySet() : Set자료구조로 바꾼다.
//		순서가 없기 때문에 iterator()
		
		
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
//			System.out.println(entry);
			if (entry.getKey().equals("name")) {
				System.out.println(entry.getValue());				
			}
		}
		
	}
}
