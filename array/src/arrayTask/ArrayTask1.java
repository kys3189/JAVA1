package arrayTask;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTask1 {

	public static void main(String[] args) {
		
//      브론즈
//      10~1까지 중 짝수만 배열에 담고 출력
//		int[] arr1 = new int[10];
//		for (int i = 0; i < arr1.length; i++) {
//			if(i % 2 == 0) {
//				arr1[i] += 10 - i;
//				System.out.println(arr1[i]);
//			}
//		}
//      1~10까지 배열에 담고 출력
//		for (int i = 0; i < arr1.length; i++) {
//			arr1[i] += (i + 1);
//			System.out.println(arr1[i]);
//		}
//		
//      1~100까지 배열에 담은 후 홀수만 출력
//		int[] arr2 = new int[100];
		
//		for (int i = 0; i < arr2.length; i++) {
//			if (i % 2 == 0) {
//				arr2[i] += (i + 1);
//				System.out.println(arr2[i]);
//			}
//		}
		
      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//		int add1 = 0;
//		for (int i = 0; i < arr2.length; i++) {
//			if (i % 2 == 1) {
//				arr2[i] += (i + 1);
//				add1 = add1 + arr2[i];
//			}
//		}
//		System.out.println(add1);
//      A~F까지 배열에 담고 출력
//		int[] arr3 = new int[6];
//		int num1 = 0;
//		num1 = 65;
//		for (int i = 0; i < arr3.length; i++) {
//			arr3[i] += num1 + i;
//			System.out.println((char)(arr3[i]));
//		}
		
//      A~F까지 중 C를 제외하고 배열에 담은 후 출력
//		int[] arr3 = new int[6];
//		int num1 = 0,
//				num2 = 0;
//		num1 = 65;
//		for (int i = 0; i < arr3.length; i++) {
//			arr3[i] += num1 + i;
//			if (arr3[i] != 'C') {
//				num2 = arr3[i];				
//				System.out.println((char)num2);
//			}			
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int[] arr1 = new int[5];
//		int num1 = 0,
//				num2 = 0,
//					num3 = 0,
//						num4 = 0,
//							num5 = 0,
//								num6 =0;
//		num1 = sc.nextInt();			
//		num2 = sc.nextInt();			
//		num3 = sc.nextInt();			
//		num4 = sc.nextInt();			
//		num5 = sc.nextInt();			
//		
//		arr1[0] = num1;
//		arr1[1] = num2;
//		arr1[2] = num3;
//		arr1[3] = num4;
//		arr1[4] = num5;
//		
//		for (int i = 0; i < arr1.length; i++) {
//			if (arr1[i] >= num6) {
//				num6 = arr1[i];
//			}
//		}
//		
//		System.out.println(num6);
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0,
				num2 = 0,
					num3 = 0;
		int[] arr1 = null;
		
		System.out.println("정수의 갯수");
		num1 = sc.nextInt();
		arr1 = new int[num1];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] += sc.nextInt();
			num2 = num2 + arr1[i];
		}
		num3 = num2 / arr1.length;
		System.out.println("정수의 평균값 : " + num3);
		
	}
	
}
