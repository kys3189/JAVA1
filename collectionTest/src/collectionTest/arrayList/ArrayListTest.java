package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest<T extends Number> {
	
	T data;
//	{
//		this.data;
//	}
	
	public static void main(String[] args) {
		
//		ArrayList datas = new ArrayList();
		ArrayList<Integer> datas = new ArrayList<Integer>();
//		ArrayList<String> datas = new ArrayList<String>();
		System.out.println(datas.size());
		datas.add(10);
		datas.add(20);
		datas.add(30);
		datas.add(40);
		datas.add(50);
		datas.add(60);
		datas.add(80);
		datas.add(80);		
		datas.add(90);		
		System.out.println(datas.size());
		
		try {
			datas.get(0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 똑바로 입력!");
			e.printStackTrace();
		} catch (Exception e) {
		}
		
		System.out.println(datas);
		
//		실습
//		추가(삽입)
//		50뒤에 500을 삽입
//		datas.add(5, 500);
//		System.out.println(datas);
		
		Collections.shuffle(datas);
		System.out.println(datas);
		
		if (datas.contains(50)) {
			try {
				
				datas.add(datas.indexOf(50) + 1, 500);
				
			} catch (IndexOutOfBoundsException e) {
			
				e.printStackTrace();
				System.out.println("인덱스 똑바로");
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
			}
		}
		
		System.out.println(datas);
		
//		수정 (90 -> 9)
//		datas.add(datas.indexOf(90) + 1, 9);
//		datas.remove(datas.indexOf(90));
//		System.out.println(datas);
		
//		datas.replaceAll((n) -> {
//			if (n == 90) {
//				return 9;
//			}else {
//				return n;
//			}
//		});
		
//		삭제된 값은 리턴됨 / 오류를 일으킬 수 있으니 트라이 캐치블록으로 잡아야함
		datas.set(datas.indexOf(90), 9);
		System.out.println(datas);
//		삭제	(80을 인덱스로 삭제)
		datas.remove(datas.indexOf(80));
		System.out.println(datas);
//		값으로 삭제 (80을 값으로 삭제)
//		
		datas.remove(Integer.valueOf(80)); //문법때문에 클래스타입으로 감싼 것 => WarpperClass 랩퍼 클래스, 작은 것을 큰 것으로 감싸는 것.
		System.out.println(datas);
	}
}
