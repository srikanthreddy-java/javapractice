package javapractice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagrams {
	
	public static void main(String args[]) {
		String str1 = "heart";
		String str2 = "earth";
		
		Map<Character, Long> frequncyMap1 = str1.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<Character, Long> frequncyMap2 = str2.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(frequncyMap1.equals(frequncyMap2));
	}
	
	
}
