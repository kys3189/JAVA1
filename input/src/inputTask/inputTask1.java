package inputTask;

import java.util.Scanner;

public class inputTask1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String message = "숫자를 2번 입력하세요.", str1 = null, str2 = null;
		System.out.println(message);
		
		str1 = scan.next();
		str2 = scan.next();
		
		int num1 = Integer.parseInt(str1);
//		number1 = Integer.parseInt(scan.next())
		int num2 = Integer.parseInt(str2);
		int result = num1 + num2;
		
		String text = "두 수의 합은 : ";
	
		System.out.println(text + result);
		
	}
	
}
