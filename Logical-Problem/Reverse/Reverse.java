package Reverse;

public class Reverse {
	public static void main(String[] args) {
		String str = "Hello world";
		char[] txts = str.toCharArray();
		String reverse ="";
		
		for (int i = txts.length-1; i >=0; i--) {
			reverse+=txts[i];
		}
		System.out.println(reverse);
	}

}
