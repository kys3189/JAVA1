package stream;

import java.util.ArrayList;
import java.util.Iterator;

public class StreamTask2 {
	
//  1) 5개의 문자열을 모두 소문자로 변경하기
//  "Black", "WHITE", "reD", "yeLLow", "PINk"
  
//  2) Apple, banana, Melon, cherry, "딸기"
//  단어 중 영문이면서, 앞글자가 대문자인 단어만 출력하기
  
//  3) 한글을 정수로 변경
//  "일공이사" -> 1024
  
//  4) 정수를 한글로 변경
//  "1024" -> "일공이사"
	
	public static void main(String[] args) {
		
	//  1) 5개의 문자열을 모두 소문자로 변경하기
	//  "Black", "WHITE", "reD", "yeLLow", "PINk"
//		ArrayList<String> datas1 = new ArrayList<String>();
//		datas1.add("Black");
//		datas1.add("WHITE");
//		datas1.add("reD");
//		datas1.add("yeLLow");
//		datas1.add("PINK");
//		datas1.stream().map(String::toLowerCase).forEach(System.out::println);
		
	//  2) Apple, banana, Melon, cherry, "딸기"
	//  단어 중 영문이면서, 앞글자가 대문자인 단어만 출력하기
//		ArrayList<String> datas2 = new ArrayList<String>();
//		datas2.add("Apple");
//		datas2.add("banana");
//		datas2.add("Melon");
//		datas2.add("cherry");
//		datas2.add("딸기");
//		
//		datas2.forEach((str) -> {
//			if (str.charAt(0) >= 65 && str.charAt(0) <= 90 ) {
//				System.out.println(str);
//			}
//		});
//		
//		datas2.stream()
//			.filter(str -> str.charAt(0) >= 'A')
//			.filter(str -> str.charAt(0) <= 'Z')
//			.forEach(System.out::println);
		
		
	//  3) 한글을 정수로 변경
	//  "일공이사" -> 1024
		char[] changeNum = {'공', '일', '이','삼','사','오','육','칠','팔','구'};
		String hangle = "공일이삼사오육칠팔구";
		
//		"일공이사".chars().forEach((c) -> {
//			for (int i = 0; i < changeNum.length; i++) {
//				if (c == changeNum[i]) {
//					System.out.print(i);
//				}
//			}
//		});
		
//		"일공이사".chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
	  
	//  4) 정수를 한글로 변경
	//  "1024" -> "일공이사"
//		"92131".chars().forEach((c) -> {
//			for (int i = 0; i < changeNum.length; i++) {
//				if (c - 48 == i) {
//					System.out.print(changeNum[i]);
//				}
//			}
//		});
		
		"213218346965".chars().map(c -> hangle.charAt(c - 48)).forEach(c -> System.out.print((char)c));
		
	}
}
