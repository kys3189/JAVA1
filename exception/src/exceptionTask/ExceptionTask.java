package exceptionTask;

import java.util.Scanner;

public class ExceptionTask {
	
//  5개의 정수를 입력 받기
//  무한 입력 상태로 구현한다
//  q를 입력시 나간다
//  입력한 각 정수는 배열에 담는다
//  if문은 딱 한 번만 사용한다.
	
	public static void main(String[] args) {
		int[] arData = new int[5];
		int count = 0;
		String expression = null,
				message = "정수 5개를 순서대로 입력하세요.",
				exampleMessage = " 번 째 정수";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		
		try {
			while (true) {
				System.out.println(count + exampleMessage);
				expression = sc.next();
				arData[count] = Integer.parseInt(expression);
				count++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스를 벗어났습니다.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			if (expression.equals("q")) {
				System.out.println("반복 종료");
			}else {				
				System.out.println("정수를 입력해주세요.");
			}
		}
	}
}
