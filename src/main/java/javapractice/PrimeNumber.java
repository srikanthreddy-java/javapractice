package javapractice;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static void main(String[] args) {
		
//		int input = 12;
//		
//		System.out.println(Math.sqrt(input));
//		
//		System.out.println(
//				IntStream.rangeClosed(2, (int)Math.sqrt(input))
//				.noneMatch( i -> input%i == 0)
//				);
		
		IntStream.rangeClosed(2, 99).filter(PrimeNumber::isPrime).forEach(System.out::println);

	}
	
	public static boolean isPrime(int number) {
		return IntStream.rangeClosed(2, (int)Math.sqrt(number))
				//.peek(divisor->System.out.println(number+"->"+divisor))
				.allMatch(divisor -> number%divisor !=0);
	}

}
