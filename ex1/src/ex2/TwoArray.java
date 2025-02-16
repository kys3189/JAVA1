package ex2;

public class TwoArray {
	public static void main(String[] args) {
		
		int[][] intArr1 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9, 10}
				};
		
		for (int i = 0; i < intArr1.length; i++) {
			System.out.println();
			for (int j = 0; j < intArr1[i].length; j++) {
				System.out.print(intArr1[i][j] + " ");
			}
		}
		
	}//메인
}//클래스
