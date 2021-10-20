package RemoveDuplicate;
public class DuplicateCalculator {

	public static void main(String[] args) {
		int[] list1 = {1, 4, 2, 7, 1, 3, 2, 1, 5, 3, 1, 7, 2, 0, 8, 5, 2, 7} ;
		for (int i = 0; i < list1.length; i++) {
			for (int j = i+1; j < list1.length; j++) {
				if(list1[i] == list1[j]) {
					System.out.println("duuplicate number" + list1[j]);
					break;
				}
			};
		}
	}
}
