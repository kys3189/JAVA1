package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] arData = new int[5];
		int num = 0;
		
		try {
//			System.out.println(arData[10]);
			arData[0] = 20;
			System.out.println(arData[0] / num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 똑바로 확인해 임마!");
		} catch (ArithmeticException e) {
			System.out.println("정수를 0으로 나눌 수 읎따 임마!");
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			e.printStackTrace(); //오류가 발생된 지점을 알려주는 코드
		} catch (Exception e) { //모든 오류를 잡는 대빵, 얘보다 나중에 실행되는 오류잡기는 전무 '데드코드'가 된다.
			e.printStackTrace(); //오류가 발생된 지점을 알려주는 코드
		}
		
	}
}
