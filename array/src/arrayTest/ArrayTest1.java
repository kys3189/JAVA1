package arrayTest;

public class ArrayTest1 {
	public static void main(String[] args) {
		
		//1) 자료형 배열명 = {값1, 값2, ...}
		//2) 자료형 배열명 = new 자료형[칸수]
		//3) 자료형 배열명 = null; // 배열주소의 초기값은 null
		// 배열명 = new 자료형[칸수];
		
//		int[] arr1 = {10, 20, 30};
//		System.out.println(arr1.length);
//		System.out.println(arr1[2]);

		int [] arr2 = {3, 1, 8, 9, 2};
		
//		for (int i = 0; i < arr2.length; i++) {
		
//			System.out.println(arr2[i]);
//		}
		
		for (int i = 0; i < arr2.length ; i++) {
			arr2[i] = 5 - i;
			System.out.println(arr2[i]);
		}
		
	}
}
