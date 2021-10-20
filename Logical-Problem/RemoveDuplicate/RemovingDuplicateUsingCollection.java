package RemoveDuplicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicateUsingCollection {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 7, 4, 9, 7, 8, 3, 8, 5, 2, 6, 5));
		Set<Integer> set = new HashSet<Integer>(list);
		List<Integer> noDuplicateList = new ArrayList<>(set);
		
//		List<String> list = new ArrayList<>(Arrays.asList("a", "v", "f", "d", "r", "a", "f"));
//		Set<String> set = new HashSet<>(list);
//		List<String> noDuplicateList = new ArrayList<>(set);
		
		
		System.out.println(noDuplicateList);
	}
}
