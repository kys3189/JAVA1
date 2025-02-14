package method;

class Calc {
	int[] arr = {1, 2};  
}

public class MethodTest {
	
//	메서드란? ~~하겠다라는 뜻.
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public void outNum(Calc calc) {
		System.out.println(calc.arr[1]);
	}
	
	public static void main(String[] args) {
		
		MethodTest mt = new MethodTest();
		System.out.println(mt.add(1, 2));
		mt.outNum(new Calc());
	}
	
}
