package javapractice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String str = "marams";
		
		// reverse string must match with input string then return true 
		System.out.println(
				IntStream.range(0, str.length())
				.mapToObj(i -> str.charAt(str.length() -1-i))
				.map(Object::toString)
				.collect(Collectors.joining()).equals(str)
				);

	}

}
