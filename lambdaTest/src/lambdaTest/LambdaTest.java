package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		LambdaInter lambdaInter = new LambdaInter() {
//			
//			@Override
//			public boolean checkMultipleOf10(int num) {
//				return num % 10 == 0;
//			}
//		};
		
//		올 트루 다 됨..
//		LambdaInter lambdaInter = (number) -> {return number % 10 == 0;};
//		LambdaInter lambdaInter = number -> {return number % 10 == 0;};
		LambdaInter lambdaInter = number -> number % 10 == 0;
		
		System.out.println(lambdaInter.checkMultipleOf10(20));
		
	}
}
