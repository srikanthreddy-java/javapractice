package javapractice;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 5; // Example input

        BigInteger factorial = IntStream.rangeClosed(1, input)
                                         .mapToObj(BigInteger::valueOf) // Convert each int to BigInteger
                                         .reduce(BigInteger.ONE, BigInteger::multiply); // Multiply all values

        System.out.println("Factorial of " + input + " is: " + factorial);
	}

}
