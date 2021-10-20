package RemoveDuplicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateUsingLoop {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 7, 4, 9, 7, 8, 3, 8, 5, 2, 6, 5));
		List<Integer> noduplicate = new ArrayList<Integer>();
		
//		List<String> list = new ArrayList<>(Arrays.asList("a", "v", "f", "d", "r", "a", "f"));
//		List<String> noduplicate = new ArrayList<>();
//		for (String i : list) {
		
		for (Integer i : list) {
			if(!noduplicate.contains(i)) {
				noduplicate.add(i);
			}
		}
		System.out.println(noduplicate);
	}
}
