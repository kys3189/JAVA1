package stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamTask3 {

	public static void main(String[] args) {
		int sumNum = 0;
		
//      1) 1~10까지 ArrayList에 담고 출력하기=======================================================
//		ArrayList<Integer> number = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(num -> number.add(num));
//		number.forEach(System.out::print);
		
		
//      2) 1~10을 ArrayList에 담고 홀수만 모두 출력하기===============================================
//		ArrayList<Integer> number = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).filter(num -> num % 2 == 1).forEach(System.out::print);
		
//      3) 1~10까지 ArrayList에 짝수만 담고 출력하기==================================================
//		ArrayList<Integer> number = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).filter(num -> num % 2 == 0).forEach(System.out::print);
		
		
//      4) a~z까지 ArrayList에 담고 출력하기========================================================
//		ArrayList<Character> character = new ArrayList<Character>();
//		IntStream.rangeClosed('a', 'z').forEach((c) -> {
//			character.add((char)c);
//		});
//		System.out.println(character);
		
//      5) a~z까지 ex) aceg... 하나씩 건너뛰고 ArrayList에 담고 출력하기================================
		ArrayList<Character> character = new ArrayList<Character>();
		IntStream.rangeClosed('a', 'z').filter((c) -> c % 2 == 1).forEach((c) -> {character.add((char)c);});
		System.out.println(character);
		
//      6) 1~30까지 ArrayList에 담고 10~20만 출력하기===============================================
//		ArrayList<Integer> number = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 30).filter((num) -> num >= 10).filter((num) -> num <= 20).forEach(System.out::println);
		
//      7) 1~10까지 ArrayList에 담고 짝수만 모두 더해서 출력하기=======================================
		ArrayList<Integer> number = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).filter(num -> num % 2 == 0).reduce((a, b) -> 0 + a + b).ifPresent(System.out::println);
		IntStream.rangeClosed(1, 10).forEach(number::add);
		number.stream().filter(num -> num % 2 == 0).reduce((a, b) -> 0 + a + b).ifPresent(System.out::println);
		
//      8) "hello", "java", "apple", "test" 문자열들을 ArrayList에 담고 'a'를 포함하고 있는 단어만 출력하기=============
//		ArrayList<String> string = new ArrayList<String>();
//		string.add("hello");
//		string.add("java");
//		string.add("apple");
//		string.add("test");
//		
//		string.stream().filter((str) -> str.contains("a")).forEach(System.out::println);
		
//      9) 1~10까지 ArrayList에 담고 모든 합을 출력하기================================================
//		ArrayList<Integer> number = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).reduce((a, b) -> a + b).stream().forEach(System.out::print);;
		
		
		
		
		
//===============================================================================================		
//      10) ArrayList에 있는 모든 값을 더한 후 출력 {10, 20, 30, 40, 50, 60}
//		ArrayList<Integer> number = new ArrayList<Integer>();
//		IntStream.rangeClosed(10, 60).filter((n) -> n % 10 == 0).forEach(num -> number.add(num));
//		
//		Optional<Integer> data = number.stream().reduce((a, b) -> a + b);
//		System.out.println(data.get());
//		for (int i = 0; i < number.size(); i++) {
//			sumNum += number.get(i);
//		}
//		System.out.println(sumNum);
//		
//		
//==============================================================================================
//		ArrayList<Member> mb = new ArrayList<Member>();
//		
//		Member 홍길동 = new Member("홍길동", "축구_농구_야구", "나는 축구왕!");
//		Member 이순신 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
//		Member 장보고 = new Member("장보고", "피아노", "피아노만 한 우물!");
//		Member 김철수 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다~");
//		Member 김영희 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
//		Member 흰둥이 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
//		
//		mb.add(홍길동);
//		mb.add(이순신);
//		mb.add(장보고);
//		mb.add(김철수);
//		mb.add(김영희);
//		mb.add(흰둥이);
//		
//		"이순신".chars().forEach(System.out::print);
//		mb.stream().forEach((mem) -> {
//			if (mem.getHobby().contains("개발")) {
//				System.out.println(mem);;				
//			}
//		});
//		
//		System.out.println("개발_축구_농구".split("_").hashCode());
		
	}
	
}
