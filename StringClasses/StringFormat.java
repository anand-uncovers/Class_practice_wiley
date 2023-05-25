package StringClasses;

import java.util.*;

public class StringFormat {

	public static void main(String[] args) {
		String title ="Java Developer";
		float salary =2000.39999f;
	//	System.out.printf("%s has %.3f USD salary",title,salary);

		List<String> techStack =Arrays.asList(
				"Essential Java",
				"Head First Java",
				"Java Design Patterns"
				);
		for(String book:techStack) {
			System.out.format("%-30s - In Stock%n",book);
		}
	}

}
