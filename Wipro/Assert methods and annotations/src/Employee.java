import java.util.ArrayList;

/** 
 * Create a class Employee and implement the below method in the class.
public String findName(ArrayList employees,String name){
  String result="";
  if(employees.contains(name)){
   result="FOUND";
  }else{
   result="NOT FOUND";
  }
  return result;
 }
Write JUnit testcases to test the above method.
 * 
 */

/**
 * @author parsh
 *
 */
public class Employee {

	/**
	 * @param args
	 */
	public String findName(ArrayList<String> employees, String name){
		String result = "";
		
		if(employees.contains(name)){
			result="FOUND";
		} else {
			result="NOT FOUND";
		}
		
		return result;
	}

	}

