package javapractice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringReverseMultiWays {
	
	public static String stringReverse(String input) {
		
		String output = null;
		
		//method 1: Character Array with Two way swapping: Efficient
		char[] chars = input.toCharArray();
		int left =0 ,right = chars.length -1;
		while(left<right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left ++;
			right --;
		}
		output = new String(chars);
		
		//Method 2: Java Functional Implementation
		output = IntStream.range(0, input.length())
				.map(i-> input.charAt(input.length()-i-1))
				.mapToObj(c -> String.valueOf((char)c))
				.collect(Collectors.joining());
		
		//Method 3: XOR Operator : Efficient
		chars = input.toCharArray();
		left = 0;
		right = chars.length-1;
		while(left<right) {
			chars[left] ^= chars[right];
			chars[right] ^= chars[left];
			chars[left] ^= chars[right];
			left++;
			right--;
		}
		output = new String(chars);
		
		//Method 4: For loop Easy, but not efficient
		String revStr = "";
		for(int i = input.length()-1; i>=0 ; i-- ) {
			revStr += input.charAt(i);
		}
		output = revStr;
		
		//Method 5: Using String Buffer
		StringBuffer buffer = new StringBuffer(input);
		buffer.reverse();
		output = buffer.toString();
		
		//Method 6: Using StringBuilder
		StringBuilder builder = new StringBuilder(input);
		builder.reverse();
		output = builder.toString();
		
		return output;
	}

	public static void main(String[] args) {
		System.out.println(stringReverse("Srikanth"));

	}

}
