package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();
		mbtiType.add("ENFP");
		mbtiType.add("INFJ");
		mbtiType.add("ISFP");
		mbtiType.add("ENFP");
		mbtiType.add("ENFP");
		mbtiType.add("ENTP");
		mbtiType.add("INFP");
		System.out.println(mbtiType);
		
//		Iterator
//		순서가 없을 때 순서를 부여하는 자료구조
		Iterator<String> iter = mbtiType.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		중복된 데이터 삭제
//		ArrayList 타입 datas에 ArrayList 생성자로 만들고
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 4, 9, 9, 9));
//		SetList 생성자에 ArrayList 데이터를 넣고 그 SetList 타입 datas를 ArrayList타입으로 바꿔서 datas에 넣는다. 
		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
		System.out.println(datas);
		
	}
}
