package arrayTask;

import java.security.MessageDigest;
import java.util.Scanner;

public class ArrayTaskUseMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//      1) 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로
//      대문자는 모두 소문자로 변경한다.
//      
//      입력 예) 안녕hI!!
//      출력 예) 안녕Hi!!
//		
//		char[] inputText = null;
//		int length = 0;
//		String userInput = null,
//				message = "입력한 값 : ",
//				message1 = "대소문자를 변환한 값 : ",
//				result = null;
//		
//		userInput = sc.nextLine();
//		length = userInput.length();
//		inputText = new char[length];
//		
//		System.out.println(message + userInput);
//		
//		for (int i = 0; i < length; i++) {
//			inputText[i] = userInput.charAt(i);
//			if (inputText[i] >= 65 && inputText[i] <= 90) {
//				result += (inputText[i] += 32);
//			}else if (inputText[i] >= 97 && inputText[i] <= 122) {
//				result += (inputText[i] -= 32);
//			}
//		}
//		
//		System.out.print(message1 + result);
//		
//==========================================================================================
//		
//      2) 정수를 한글로 변경
//      - 입력 값을 배열에 담고 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
//		
//		char[] changText = null;
//		int length = 0;
//		String userInput = "",
//				message = "입력된 숫자 : ",
//				message1 = "변환된 한글 : ",
//				result = "";
//		
//		userInput = sc.nextLine();
//		length = userInput.length();
//		changText = new char[length];
//		
//		for (int i = 0; i < length; i++) {
//			
//			changText[i] = userInput.charAt(i);
//			
//			switch (changText[i]) {
//			case '0': {
//				changText[i] = '공';
//				break;
//			}
//			case '1': {
//				changText[i] = '일';
//				break;
//			}
//			case '2': {
//				changText[i] = '이';
//				break;
//			}
//			case '3': {
//				changText[i] = '삼';
//				break;
//			}
//			case '4': {
//				changText[i] = '사';
//				break;
//			}
//			case '5': {
//				changText[i] = '오';
//				break;
//			}
//			case '6': {
//				changText[i] = '육';
//				break;
//			}
//			case '7': {
//				changText[i] = '칠';
//				break;
//			}
//			case '8': {
//				changText[i] = '팔';
//				break;
//			}
//			case '9': {
//				changText[i] = '구';
//				break;
//			}
//			default:
//			
//			}
//			
//			result += changText[i];
//			
//		}
//		
//		System.out.println(message + userInput);
//		System.out.println(message1 + result);
//		
//==========================================================================================
//		
//      3) 문자열과 찾을 문자를 입력받고
//      문자열에서 문자의 개수를 찾기
//      예시) 입력: content cc!
//          찾을 문자 : c
//          c의 개수 3개
//		
		char[] userInputData = null;
		String userInput = "",
				message = "입력한 텍스트 : ",
				message1 = "텍스트를 입력해주세요.",
				message2 = "c의 갯수 : ";
		int count = 0,
			length = 0;
		
		System.out.println(message1);
		
		userInput = sc.nextLine();
		length = userInput.length();
		userInputData = new char[length];
		
		for (int i = 0; i < length; i++) {
			userInputData[i] = userInput.charAt(i);
			if (userInputData[i] == 'c') {
				count += 1;
			}
		}
		
		System.out.println(message + userInput);
		System.out.println(message2 + count);
		
		}
	
}
