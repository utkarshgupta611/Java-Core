package RemoveDuplicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateUsingStream {

	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 7, 4, 9, 7, 8, 3, 8, 5, 2, 6, 5));
//		List<Integer> noduplicate = list.stream().distinct().collect(Collectors.toList());
		
		List<String> list = new ArrayList<>(Arrays.asList("a", "v", "f", "d", "r", "a", "f"));
		List<String> noduplicate = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(noduplicate);
	}
}
