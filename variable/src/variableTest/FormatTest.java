package variableTest;

public class FormatTest {

	public static void main(String[] args) {
		String name = "김영수";
		int age = 20;
		double height = 183.1;
		
		System.out.printf("이름 : %s\n", name);//f = format
		System.out.printf("나이 : %d\n", age);
		System.out.printf("키 : %.1fcm", height);
	}
	
}
