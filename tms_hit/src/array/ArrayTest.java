package array;

// 배열은 바구니같은 친구다.
// 배열은 값들이 순서대로 나열된것 0~100번방까지의...
// [1, 2, 3, 4, 5] <=배열이에용
// 배열의 반복문을 돌리기 위해서는 규칙성을 찾아야 한다.

public class ArrayTest {
	public static void main(String[] args) {
		int[] ramdomNumber = new int[6];
		
		for (int i = 0; i < ramdomNumber.length; i++) {
			
			ramdomNumber[i] = (int)(Math.random() * 45) + 1;
			
			for (int j = 0; j < i; j++) {
				if (ramdomNumber[j] == ramdomNumber[i]) {
					i--;
					break;
				}
			}
		}
		for (int j = 0; j < ramdomNumber.length; j++) {
			System.out.print(ramdomNumber[j] + " ");			
		}
	}
}
