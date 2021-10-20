package Reverse;

public class ReverseInt {

	public static void main(String[] args) {
		int number = 987654;
		int reverse =0;
		
		while(number != 0) {
			int remender = number % 10;
			reverse = reverse * 10 + remender;
			number = number / 10;
		}
		System.out.println("reverse number  = = " + reverse );
	}
}
