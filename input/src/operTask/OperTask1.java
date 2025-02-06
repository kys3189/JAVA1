package operTask;

import java.util.Scanner;

public class OperTask1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		double num1 = 0D;
		String str1 = null,
				result = null;
		
		System.out.println("정수 혹은 실수를 입력하세요.");

		str1 = sc.next();
		num1 = Double.parseDouble(str1);
		result = num1 % 1 == 0 ? "정수입니다." : "실수입니다." ;
		
		System.out.println(result);
		
	}
	
}
