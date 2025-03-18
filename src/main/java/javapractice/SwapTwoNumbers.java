package javapractice;

public class SwapTwoNumbers {

	public static void swapNumbers(int a, int b) {
		System.out.println("a:"+a+"::"+"b:"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a:"+a+"::"+"b:"+b);
	}
	
	public static void main(String args[]) {
		
		swapNumbers(5,6);
		
		//
	}
}
