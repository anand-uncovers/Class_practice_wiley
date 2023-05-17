package lambda;


import java.util.HashMap;
import java.util.function.Function;
import java.util.*;

public class BuiltInFunction {

	private static HashMap<Integer, String> Employee = new HashMap<>();
	
	public static void add(String name, int ID) {
		if(!Employee.containsKey(ID)) {
			Employee.put(ID, name);
		}else 
			System.out.println("Employee already exists..!");
	}
	public static void main(String[] args) {
	    //Function to get the name of the employee name from its ID
		Function<Integer,String> get = (Integer ID )->{
			if(Employee.containsKey(ID))return Employee.get(ID);
			
			else 
				return "Invalid ID";
		};
		
		//Add employees to hashmap
		add("Aastha",101);
		add("Anand",102);
		add("Akansha",103);
		
		System.out.println("ID=101, Name= "+get.apply(101));
		
  
	}

}
