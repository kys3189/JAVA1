package lambdaExpert;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

//[심화 실습]
//여러 개의 정수를 입력받아서 알맞은 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작
//
//입력 예1) 7 + 35 - 9
//출력 예1) 33
//
//입력 예2) -9 + 8 + 10
//출력 예2) 9
//
//* "ABC".split("")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
//   "A,B,C".split(",")은 [A][B][C] 3칸 문자열 배열로 리턴된다.
//   split("구분점")을 전달하면 문자열에서 동일한 구분점을 기준으로 문자열 값을 잘라낸 후 문자열 배열로 리턴한다.
//   구분점을 여러 개 사용할 때에는 split("구분점|구분점")으로 사용하며, "+", "-"를 구분점으로 사용할 때에는 "\\+", "\\-"로 표현한다.
//   예)"4 + 9".split("\\+")은 [4][9] 2칸 문자열 배열로 리턴
//
//* 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//* 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)
//* 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
//* 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)
//* main메소드에 getOpers를 람다식으로 구현
//* 첫번째 정수가 음수일 경우 오류 해결

public class MyMath {
//연산자 1개를 전달 받아서 알맞게 연산하도록 람다식을 구현
	
	public static Calc caculater(String oper) {
//		String[] strArr1 = null;
//		String[] strArr2 = null;
//		String result1 = null,
//				result2 = null,
//				result3;
//		int resultint1 = 0,
//				resultint2 = 0;
//		strArr1 = oper.split("[0-9]");
//		strArr2 = oper.split("\\+|\\-|\\*|\\/|\\%");
//		result1 = strArr2[0];
//		result2 = strArr2[1];
//		result3 = strArr1[1];
//		resultint1 = Integer.parseInt(result1);
//		resultint2 = Integer.parseInt(result2);
//		
//		Calc calc1 = (num1, num2) -> {
//			if (result3 == "+") {
//				
//			}
//		};
//		calc1.calc(resultint1, resultint2);
		return null;
	}
	
	public static void main(String[] args) {
//		사용자가 수식을 입력
//		전체 수식에서 연산자만 분리하는 메서드를 구현
//		알맞게 연산 처리
//		결과값을 출력
//		Scanner sc = new Scanner(System.in);		
//		String userInput = null;
//		String[] strArr = null;
//		userInput = sc.nextLine();
		MyMath mM = new MyMath();
		
//		mM.caculater("1+1");
		
		String str1 = "5+3+44";
		
		String[] strArr1 = null;
		String[] strArr2 = null;
		
		int[] intArr1 = null;
		int[] intArr2 = null;
		
		int value = 0;
		
		strArr1 = str1.split("\\+|\\-|\\*|\\/|\\%");
		strArr2 = str1.split("[0-9]");
		
		intArr1 = new int[strArr1.length];
		intArr2 = new int[strArr2.length];
		value = intArr1[0];
		for (int i = 0; i < strArr1.length; i++) {
			intArr1[i] = Integer.parseInt(strArr1[i]);
			System.out.println(intArr1[i]);
			for (int j = 1; j < strArr2.length; j++) {
				System.out.println(strArr2[j]);
				if (strArr2[j] == "+") {
					value = value + intArr1[j];
					System.out.println(value);
				}
			}
		}
		
	}
	
}
	

