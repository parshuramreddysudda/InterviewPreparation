import java.util.ArrayList;

public class Assignment2   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> Emp= new ArrayList<Employee>(5);
		Emp.add( new Employee(1, "Ram", "Hyderabad", 12000));
		Emp.add( new Employee(2, "Jimz", "Ibp", 11000));
		Emp.add( new Employee(3, "Indu", "Secundrabad", 34000));
		Emp.add( new Employee(4, "Wipro", "Hyderabad", 62000));
		Emp.add( new Employee(5, "Sri", "Hyderabad", 82000));
		System.out.println("Employee Details");
		System.out.println("Id \tName \tAddress \tSalary");
		Emp.forEach(item->{
			System.out.println(item.id+"\t"+item.name+"\t"+item.Address+"\t"+item.salary);
		});

		

	}

}

class Employee{
	public int id;
	public String name;
	public String Address;
	public Employee(int id, String name, String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int salary;
}
