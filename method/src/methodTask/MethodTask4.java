package methodTask;

import java.util.Iterator;

public class MethodTask4 {

//  1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
	void strCount(String text, char str1) {
		int count = 0,
				num1 = text.length();
		char[] c = null;
		c = new char[num1];
		for (int i = 0; i < num1; i++) {
			c[i] = text.charAt(i);
			if (c[i] == text.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
//  2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
	void fiveNumIndex(int num1, int num2, int num3, int num4, int num5, int index) {
		int[] arr = new int[5];
		arr[0] = num1;
		arr[1] = num2;
		arr[2] = num3;
		arr[3] = num4;
		arr[4] = num5;
		System.out.println(arr[index - 1]);
	}
	
//  3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
	void changeHangle(String text) {
		int num1 = 0;
		char[] changText = null;
		char[] numArr = null;
		
		num1 = text.length();
		changText = new char[num1];
		numArr = new char[num1];
		for (int i = 0; i < changText.length; i++) {
			changText[i] = text.charAt(i);
			switch (changText[i]) {
			case '공': {
				numArr[i] = '0';
				break;
			}
			case '일': {
				numArr[i] = '1';
				break;
			}
			case '이': {
				numArr[i] = '2';
				break;
			}
			case '삼': {
				numArr[i] = '3';
				break;
			}
			case '사': {
				numArr[i] = '4';
				break;
			}
			case '오': {
				numArr[i] = '5';
				break;
			}
			case '육': {
				numArr[i] = '6';
				break;
			}
			case '칠': {
				numArr[i] = '7';
				break;
			}
			case '팔': {
				numArr[i] = '8';
				break;
			}
			case '구': {
				numArr[i] = '9';
				break;
			}
			default:
			
			}
			System.out.print(numArr[i]);
			
		}
		
	}
	
//  4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
	void fiveNumBS(int[] num1) {
		int num2 = 0,
				num3 = 0;
		num3 = num1[0];
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] >= num2) {
				num2 = num1[i];
			}
		}
		for (int i = 0; i < num1.length; i++) {
			if (num3 >= num1[i]) {
				num3 = num1[i];
			}
		}
		System.out.println("\n" + num2);
		System.out.println(num3);
	}
//  5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
//	매개 변수 2개 : 최솟값과 최대값을 구할 배열, 최솟값과 최댓값을 구한 결과를 담을 배열
	void fiveNumBS2(int i) {
		
	}
	
	
//  6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	void myIndexOf(String str1, char c) {
		char[] text = null;
		
		text = new char[str1.length()];
		System.out.println(str1);
		for (int i = 0; i < text.length; i++) {
			text[i] = str1.charAt(i);
			if (text[i] == c) {
				System.out.println(i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		MethodTask4 mt = new MethodTask4();
		int[] intArr = {5, 2, 3, 4, 5};
		
//		//1번문제
//		mt.strCount("ccc", 'c');
//		//2번문제
//		mt.fiveNumIndex(12, 2, 3, 5, 6, 3);
//		//3번문제
//		mt.changeHangle("일공이삼");
//		//4번문제
//		mt.fiveNumBS(intArr);
		//5번문제
		
		//6번문제
//		mt.myIndexOf("dsasdadas", 's');
		
	}
	
}
