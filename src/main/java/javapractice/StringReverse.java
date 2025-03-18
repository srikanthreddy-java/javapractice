package javapractice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverse {

	public static void main(String[] args) {
		
		String str = "srikanth";
		
		System.out.println(IntStream.range(0, str.length()) // index stream
				.mapToObj(i -> str.charAt(str.length()-1 -i))// Access characters
				.map(Object::toString) //convert char to string
				.collect(Collectors.joining()) // Join them into a reverse string
				);

	}

}
