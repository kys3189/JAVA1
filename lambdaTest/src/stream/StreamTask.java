package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		IntStream.range(1, 11).forEach((num) -> {
			number.add(num);
		});
		
//		number.forEach(System.out::print);
		
//		ArrayList<Integer> number2 = new ArrayList<Integer>();
//		IntStream.rangeClosed(65, 72).forEach((num) -> {
//			number2.add(num);
//		});
//		String str2 = number2.stream().sorted().map(String::valueOf).collect(Collectors.joining(", "));
//		System.out.println(str2);
//		"ABCDEF".chars().forEach(c -> {System.out.println((char)c);});
		
		
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		
		IntStream.rangeClosed(1, 100).forEach((num) -> {
			num2.add(num);
		});
//		num2.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
		
//		ArrayList<String> str = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
//		str.stream().filter(str3 -> str3 != "D").forEach(System.out::println);
		
		ArrayList<Character> strc = new ArrayList<Character>();
		IntStream.rangeClosed('A', 'E')
		.map(c -> c > 67 ? c + 1 : c)
		.forEach(c -> strc.add((char)c));
		strc.forEach(System.out::println);
		
	}
}
