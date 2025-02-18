package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		IntStream.range(1, 11).forEach((num) -> {
			number.add(num);
		});
		
//		number.forEach(System.out::print);
		
		ArrayList<String> str = new ArrayList<String>();
//		다시풀장
		
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		
		IntStream.rangeClosed(1, 100).forEach((num) -> {
			num2.add(num);
		});
//		num2.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
		
		str.stream().filter(str2 -> str2 != "D").forEach(System.out::println);
		
	}
}
