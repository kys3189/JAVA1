package variableTest;

public class Variable {

	public static void main(String[] args) {
		
		int a = 10; //정수 4byte
		long b = 20; //정수 8byte
		float c = 3.14F; //실수 4byte
		double d = 10; //실수 8byte
		boolean e = true; //논리 1byte
		char f = '김'; //문자형 2byte
		String g = "김영수"; // 문자열 ?
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println(g);
		
		int data = 20; // 왼쪽에 대입연산자&오른쪽에 대입연산자 = 저장공간 / 없으면 값이겠죠?
		data = 30;
		System.out.println(data + 10);
//		data - 9;
		int data2;
	}
	
}
