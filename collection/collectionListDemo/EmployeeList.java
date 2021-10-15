package collectionListDemo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Utkarsh", 9041120202l, "utkarsh@gmail"));
		empList.add(new Employee(2, "Akshay", 9041786502l, "akshay@gmail"));
		empList.add(new Employee(3, "Anse", 903422202l, "anse@gmail"));
		empList.add(new Employee(4, "Jishnu", 9898120202l, "jishnu@gmail"));
		empList.add(new Employee(5, "Nidhi", 7234120202l, "nidhi@gmail"));
		System.out.println("**************************************************");
		System.out.println(empList);
		System.out.println("**************************************************");
	
		System.out.println("Sorted by ID");
		empList.sort((e1, e2)-> e1.getId()-e2.getId());
		
		System.out.println(empList);
		
		System.out.println("Sorted by Name");
		empList.sort((e1, e2)-> e1.getName().compareTo(e2.getName()));
		System.out.println(empList);
		
		System.out.println("Sorted by Mobile");
		empList.sort((e1, e2)-> (int)(e1.getMobile()-e2.getMobile()));
		System.out.println(empList);
	}
}
