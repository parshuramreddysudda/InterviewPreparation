import java.util.Iterator;
import java.util.Vector;

/**
 * 
 */

/**
 * @author parsh
 *
 */
class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + getId() + ", name=" + getName() + ", address=" + getAddress() + ", salary=" + getSalary() + "]";
	}

	private Double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	private String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	private String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

public class Assignment8 {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<>();
		
		list.add(new Employee(101, "Bob", "123 street, India", 20000.0));
		list.add(new Employee(102, "Alice", "234 street, India", 30000.0));
		list.add(new Employee(103, "John", "345 street, India", 25000.0));
		list.add(new Employee(104, "Stuart", "456 street, India", 40000.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			System.out.println(it.next());
		

	}

}