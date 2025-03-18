package javapractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWords {

	public static void main(String[] args) {
		String str = "this is test test can be written";
		
		String strarr[] = str.split(" ");
		
		
		
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		
		Map<String, Long> wordCounts = Arrays.asList(strarr)
				.stream().map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		for(String s: strarr) {
			map.put(s, map.getOrDefault(s, 0) +1);
		}
		
		System.out.println(wordCounts);

	}

}
