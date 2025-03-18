package javapractice;


public class SumOfDigits {

	public static void main(String[] args) {
		
		int input = 124;
		
		System.out.println(
				String.valueOf(input).chars()
				.map(Character::getNumericValue)
				.sum()
				);

	}

}
