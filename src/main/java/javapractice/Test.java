package javapractice;

import java.util.Arrays;
import java.util.List;

public class Test {
	
	static int[] input1 = {1, 5, 7, 8};
	static int[] input2 = {2, 5, 7, 9};
	

	public static void main(String[] args) {
		
		List<int[]> fullElements= Arrays.asList(input1);
		fullElements.addAll(Arrays.asList(input2));
		fullElements.stream().distinct();
	}

}
