package inputTask;

import java.util.Scanner;

public class inputTask2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text1 = "3개의 정수를 입력하세요.", text2 = "첫번째 정수를 입력하세요.", text3 = "두번째 정수를 입력하세요.", text4 = "세번째 정수를 입력하세요.", text5 = "3개의 정수의 곱셈 결과 : ";
		int num1 = 0, num2 = 0, num3 = 0;
		
		System.out.println(text1);
		System.out.println(text2);
		num1 = Integer.parseInt(sc.next());
		System.out.println(text3);
		num2 = Integer.parseInt(sc.next());
		System.out.println(text4);
		num3 = Integer.parseInt(sc.next());
//		num4 = sc.nextInt();  //받으면서 형변환
//		num5 = sc.nextDouble();
		
		int result = num1 * num2 * num3;
		
		System.out.println(text5 + result);
		
	}
	
}
