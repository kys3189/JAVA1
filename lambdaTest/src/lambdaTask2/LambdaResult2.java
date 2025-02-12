package lambdaTask2;

//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열을 리턴해주는 람다구현 Reverse, reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove, removeStr()
//5) 문자열에서 중복된 값을 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"

public class LambdaResult2 {
	public static void main(String[] args) {
//		1번 문제===================================================
//		PrintNum printNum = () -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.print(i + 1);
//			}
//		};
//		printNum.printUpTo10();
//		2번 문제===================================================
//		PrintString printString = (String str, char str2) -> {
//			int count = 0;
//			for (int i = 0; i < str.length(); i++) {
//				if (str.charAt(i) == str2) {
//					count++;
//				}
//			}
//			System.out.println(count);
//		};
//		
//		printString.strCount("asdfasdf", 'a');
//		3번 문제===================================================
//		Reverse reverse = (String str) -> {
//			String result = "";
//			for (int i = 0; i < str.length(); i++) {
//				result = str.charAt(i) + result;
//			}
//			System.out.println(result);
//		};
//		reverse.reverseString("가나다라마바사");
//		4번 문제===================================================
//		Remove remove = (String str, char c) -> {
//			String result = "";
//			for (int i = 0; i < str.length(); i++) {
//				if (str.charAt(i) != c) {
//					result += str.charAt(i);
//				}
//			}
//			System.out.println(result);
//		};
//		remove.reverseString("asdfasdf", 'a');
//		5번 문제===================================================
		Dedupe dedupe = (String str) -> {
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				if(!result.contains(String.valueOf(str.charAt(i)))) {
					result += String.valueOf(str.charAt(i));
				}
			}
			System.out.println(result);
		};
		dedupe.getDedupe("가나다라마바사가나다라마바사");
	}
	
}
