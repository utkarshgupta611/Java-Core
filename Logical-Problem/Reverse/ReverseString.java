package Reverse;

public class ReverseString {

	public static void main(String[] args) {
		String str = "i am Software dev";
		char[] words = str.toCharArray();
		String rev="" ;
		for (int i = words.length -1 ; i >=0; i--) {
			rev += words[i];
		}
		System.out.println(rev);
	}
}
