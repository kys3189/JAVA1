package methodTask;

public class MethodTask3 {
	
	public void numSub(int num1, int num2, int num3) {
		int i = 0;
		i = num1 - num2 - num3;
		System.out.println("세 정수를 뺸 값 : " + i);
	}
	
	//int[]타입도 출력가능
	int[] numDivid(int num1, int num2) {
		int[] numArr = new int[2];
		numArr[0] = num1 / num2;
		numArr[1] = num1 % num2;
		return numArr;
//		System.out.println("두 정수를 나눈 몫 : " + numArr[0]);
//		System.out.println("두 정수를 나눈 나머지 : " + numArr[1]);
	}
	
	
	void numAdd(int num1) {
		int j = 0;
		for (int i = 0; i < num1; i++) {
			j = j + i + 1;
		}
		System.out.println("입력한 값 까지 더한 수 : " + j);
	}
	
	
	String numOddEven(int num1) {
//		String str1 = null;
		if (num1 == 0) {
			return "다시 입력해주세요.";
		}
		return num1 % 2 == 0 ? "짝수" : "홀수";
//		System.out.println("입력한 값은 " + str1 + " 입니다.");
	}
	
	
	void strUpDown(String text) {
		char[] str1 = null;
		str1 = new char[text.length()];
		
		System.out.print("입력한 영문자열의 반대 : ");
		for (int i = 0; i < str1.length; i++) {
			str1[i] = text.charAt(i);
			if (str1[i] >= 65 && str1[i] <= 90) {
				str1[i] += 32;
			}else if (str1[i] >= 97 && str1[i] <= 122) {
				str1[i] -= 32;
			}
			System.out.print(str1[i]);
		}
	}
	
	public static void main(String[] args) {
	
		MethodTask3 mt = new MethodTask3();
		int numDivid = 0,
				numDivid2 = 0;
		String numOddEven = null;
		
		mt.numSub(3189, 555, 111);
		numDivid = mt.numDivid(555, 6)[0];
		numDivid2 = mt.numDivid(555, 6)[1];
//		mt.numDivid(666, 7);
		System.out.println("두 정수의 몫 : " + numDivid);
		System.out.println("두 정수의 나머지 : " + numDivid2);
		mt.numAdd(100);
//		mt.numOddEven(9);
		numOddEven = mt.numOddEven(10);
		System.out.println("입력한 값은 : " + numOddEven + "입니다."); 
		mt.strUpDown("한글 aSDada");
		
		//문자가 몇번째 인덱스에 있는지 구해주는 메서드
		System.out.println("abcdeafq".indexOf('a'));
		
	
	}
}
