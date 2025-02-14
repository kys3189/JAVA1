package testTask;

public class Test {
	
	public int[] drawNumber() {
		
		int[] ramdomNumber = new int[6];
		
		for (int i = 0; i < ramdomNumber.length; i++) {
			
			ramdomNumber[i] = (int)(Math.random() * 10) + 1;
			
			for (int j = 0; j < i; j++) {
				if (ramdomNumber[j] == ramdomNumber[i]) {
					i--;
					break;
				}
			}
		}
		return ramdomNumber;
	}
	
	public static void main(String[] args) {
		
		Test test = new Test();
		int[] intArr = new int[6];
		
		intArr = test.drawNumber();
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
	}
}
