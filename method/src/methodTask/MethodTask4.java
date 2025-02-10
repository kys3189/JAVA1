package methodTask;


public class MethodTask4 {

//  1) 문자열을 입력 받고 원하는 문자의 개수를 구해주는 메소드
	
	void textCounter(String str, char c) {
		int count = 0,
			num = 0;
		char[] text = null;
		String message = "입력받은 문자의 갯수 : ";
		
		num = str.length();
		text = new char[num];
		
		for (int i = 0; i < num; i++) {
			text[i] = str.charAt(i);
			if (text[i] == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(message + count);
	}
	
//  2) 5개의 정수를 입력 받은 후 원하는 인덱스의 값을 구해주는 메소드
	
	void indexSearch(int num1, int num2, int num3, int num4, int num5, int index) {
		int[] numArr = new int[5];
		String message = "번 인덱스에 담긴 값 : ";
		
		numArr[0] = num1;
		numArr[1] = num2;
		numArr[2] = num3;
		numArr[3] = num4;
		numArr[4] = num5;
		
		System.out.println((index) + message + numArr[index]);
	}
	
//  3) 한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
	
	void changeHangle(String str) {
		int num = 0;
		char[] changText = null;
		char[] numArr = null;
		String message = "입력한 한글 : ",
				message1 = "변환한 숫자 : ",
				result = "";
		
		num = str.length();
		changText = new char[num];
		numArr = new char[num];
		
		System.out.println(message + str);
		
		for (int i = 0; i < num; i++) {
			
			changText[i] = str.charAt(i);
			
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
			
			result += numArr[i];
			
		}
		
		System.out.println(message1 + result);
		
	}
	
//  4) 5개의 정수를 입력받고 최댓값과 최솟값을 구해 값을 반환해주는 메소드
	void fiveNumBS(int[] num) {
		int numDefault = 0,
			length = 0;
		String message = "입력한 값의 최대값 : ",
				message1 = "입력한 값의 최소값 : ";
		
		length = num.length;
		numDefault = num[0];
		
		for (int i = 0; i < length; i++) {
			if (num[i] >= numDefault) {
				numDefault = num[i];
			}
		}
		
		System.out.println(message + numDefault);
		
		for (int i = 0; i < length; i++) {
			if (numDefault >= num[i]) {
				numDefault = num[i];
			}
		}
		
		System.out.println(message1 + numDefault);
	
	}
//  5) 5개의 정수를 입력받고 최댓값과 최솟값을 구해주는 기능을 가진 메소드(void)
//	매개 변수 2개 : 최솟값과 최대값을 구할 배열, 최솟값과 최댓값을 구한 결과를 담을 배열
	void fiveNumBS2(int num1, int num2, int num3, int num4, int num5) {
		int[] numArr = new int[5];
		int numDefault = 0;
		String message = "입력한 값의 최대값 : ",
				message1 = "입력한 값의 최소값 : ";
		
		numArr[0] = num1;
		numArr[1] = num2;
		numArr[2] = num3;
		numArr[3] = num4;
		numArr[4] = num5;
		
		for (int i = 0; i < 5; i++) {
			if (numArr[i] >= numDefault) {
				numDefault = numArr[i];
			}
		}
		
		System.out.println(message + numDefault);
		
		for (int i = 0; i < 5; i++) {
			if (numDefault >= numArr[i]) {
				numDefault = numArr[i];
			}
		}
		
		System.out.println(message1 + numDefault);
		
	}
	
	
//  6) String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자를 전달 받는다.
	void myIndexOf(String str, char c) {
		char[] text = null;
		String message = "검색한 문자의 위치 : ",
				message1 = "입력한 문자열 : ",
				message2 = "검색한 문자 : ",
				result = "";
		
		text = new char[str.length()];		
		
		for (int i = 0; i < text.length; i++) {
			text[i] = str.charAt(i);
			if (text[i] == c) {
			result += i + " ";
			}
		}
		
		System.out.println(message1 + str);
		System.out.println(message2 + c);
		System.out.println(message + result);
	
	}
	
	
	public static void main(String[] args) {
		
		MethodTask4 mt = new MethodTask4();
		int[] intArr4 = {5, 2, 3, 4, 7};
		
		//1번문제
		mt.textCounter("ccc", 'c');
		
		//2번문제
		mt.indexSearch(12, 2, 3, 5, 6, 3);
		
		//3번문제
		mt.changeHangle("일공이삼");
		
		//4번문제
		mt.fiveNumBS(intArr4);
		
		//5번문제
		mt.fiveNumBS2(10, 5, 20, 4, 2);
		
		//6번문제
		mt.myIndexOf("it is your index", 'i');
		
	}
	
}
