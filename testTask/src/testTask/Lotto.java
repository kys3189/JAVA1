package testTask;

//로또를 생성하는 메서드를 담은 클래스

public class Lotto {

	public int[] drawNumber() {
		
		int[] ramdomNumber = new int[6];
		
		for (int i = 0; i < ramdomNumber.length; i++) {
			ramdomNumber[i] = (int)Math.floor((Math.random() * 45) + 1);
			for (int j = 0; j < i; j++) {
				if (ramdomNumber[j] == ramdomNumber[i]) {
					i--;
					break;
				}
			}
		}
		return ramdomNumber;
	}
}
