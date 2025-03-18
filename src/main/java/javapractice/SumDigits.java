package javapractice;

public class SumDigits {
	
	public static Integer sumOfDigits(int number) {
		int sum=0;
		char[] chDigits = String.valueOf(number).toCharArray();
		if (number>0 && number<10) {
			return number;
		}
		for(char ch :chDigits) {
			int i = Character.getNumericValue(ch);
			sum = sum+i;
		}
		return sumOfDigits(sum);
	}

	public static void main(String[] args) {
		System.out.println(sumOfDigits(582369));
		
//		char ch='5';
//		System.out.println(Character.getNumericValue(ch));

	}

}
