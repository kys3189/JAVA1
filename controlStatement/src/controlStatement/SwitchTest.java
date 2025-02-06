package controlStatement;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String message = "월을 입력하세요. \n 예)10",
					seasonResult = "";
		int month = 0,
				result = 0,
					season = 0;
		System.out.println(message);
		
		month = sc.nextInt();
		if(month > 0 && month <= 12) {
			season = month / 3 % 4;
		
		switch(season) {
			case 0:
				seasonResult = month + "월은 겨울입니다.";
				break;
			case 1:
				seasonResult = month + "월은 봄입니다.";
				break;
			case 2:
				seasonResult = month + "월은 여름입니다.";
				break;
			case 3:
				seasonResult = month + "월은 가을입니다.";
				break;
		}
			
			System.out.println(seasonResult);
				
		}else {
			System.out.println("잘못된 월입니다.");
		}
	}
	
}
