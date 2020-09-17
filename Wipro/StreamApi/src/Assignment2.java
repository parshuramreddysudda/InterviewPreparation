import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {

	public Assignment2() {

	}
	
	public static void main(String args[]) {
		ArrayList<Employe> emp = new ArrayList<Employe>(5);
		emp.add(new Employe(1, "Ram", 65, "Hyderabad"));
		emp.add(new Employe(2, "Vamsi", 1230, "Pune"));
		emp.add(new Employe(3, "Rohit", 1345, "Mumbai"));
		emp.add(new Employe(4, "Vishnu", 7824, "Pune"));

		List<Employe> filteredList = emp.stream().filter(employe -> employe.location == "Pune").collect(Collectors.toList());
		System.out.println("Id \t Name \t Age \t Location");
		filteredList.forEach(employe->{
			System.out.println(employe.empNo+"\t"+employe.name+"\t"+employe.age+"\t"+employe.location);
		});
        
	}

}

class Employe {

	public int empNo;
	public String name;
	public int age;
	public String location;

	public Employe(int empNo, String name, int age, String location) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}