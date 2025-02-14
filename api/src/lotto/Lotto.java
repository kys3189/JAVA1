package lotto;

public class Lotto {
	//스트링 배멸을 리턴하는 메서드
	public String[] getLuckNumber() {
		//스트링 배열 6칸 생성
		String[] luckyNumberArray = new String[6];
		//배열만큼 돌리고
		for (int i = 0; i < 6; i++) {
			// i 번째 값에 
			luckyNumberArray[i] = String.valueOf((int)Math.floor((Math.random() * 45 + 1)));
			for (int j = 0; j < i; j++) {
				if (luckyNumberArray[j].equals(luckyNumberArray[i])) {
					i--;
					break;
				}
			}
		}
		return luckyNumberArray;
	}
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		String[] lucky = null;
		lucky = lotto.getLuckNumber();
		
		String message = "이번주 당첨 번호";
		System.out.println(message);
		for (String luckyNum : lucky) {
			System.out.print(luckyNum + " ");
		}
	}
}
