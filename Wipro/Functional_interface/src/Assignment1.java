import java.util.ArrayList;
import java.util.List;

interface getLocation {
	
	
     String location(Employe emp);
}

public class Assignment1 implements getLocation {

	public Assignment1() {
		// TODO Auto-generated constructor stub
	}
	public String location(Employe emp) {
		return emp.location;
	}

	public static void main(String[] args) {
		
		ArrayList<Employe> emp = new ArrayList<Employe>(5);
		emp.add(new Employe(1, "Ram", 65, "Hyderabad"));
		emp.add(new Employe(2, "Vamsi", 1230, "Pune"));
		emp.add(new Employe(3, "Rohit", 1345, "Mumbai"));
		emp.add(new Employe(4, "Vishnu", 7824, "Pune"));
		emp.add(new Employe(5, "Phani", 78254, "Pune"));
		
		List<String> filteredList=new ArrayList<String>(5);
		Assignment1 loc=new Assignment1();
		
		emp.stream().forEach(emplo->{
			filteredList.add(loc.location(emplo));
		});
		
		System.out.print(filteredList);
		

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
