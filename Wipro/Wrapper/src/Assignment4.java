/**
 * 
 */

/**
 * @author parsh
 *
 */

	/**
	 * @param args
	 */
	class Employee implements Cloneable {
		private String name;
		
		public Employee(String name) {
			this.name = name;
		}
		
//		public Employee(Employee emp) {
//			this.name = emp.name;
//		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public Employee clone() {
			try {
				return (Employee) super.clone();
			} 
			catch (CloneNotSupportedException e) {
				System.out.println("Cloning Not Allowed");
				return this;
			}
			catch(Exception e) {
				System.out.println("Other Exception "+e);
				return null;
			}
			
		}
	}

	public class Assignment4 {

		public static void main(String[] args) {
			Employee emp = new Employee("Bob Biswas");
			Employee empClone = emp.clone();
			
			empClone.setName("Ram Doe");
			
			System.out.println(empClone.getName());
			System.out.println(emp.getName());
		}

	}
