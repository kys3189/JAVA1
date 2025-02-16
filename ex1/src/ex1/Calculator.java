package ex1;

public class Calculator {

	public int addNum(int num1, int num2) {
		return num1 + num2;
	}
	
	private int swapInt(double num1) {
		return (int)num1;
	}
	
	private void strPrint(String str1, String str2) {
		System.out.println(str1 + str2);
	}
	
	public static void main(String[] args) {
	
		Calculator cc = new Calculator();
		
		System.out.println(cc.addNum(2, 2));
		System.out.println(cc.swapInt(1.10));
		cc.strPrint("안녕", "하시겠죠..?");
		
	}//메인
	
}//클래스
