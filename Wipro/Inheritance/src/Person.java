/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Person {

	/**
	 * 
	 */
	 
	String name;
	static String dateOfBirth;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Teacher t=new Teacher(24000,"English");
		CollegeStudent c=new CollegeStudent("SRi Indu ","2020", "16D41A05J6");
	}

}
 class Teacher extends Person{
	 
		int salary;
		String subject;
		
	 public Teacher(int salary,String subject){
		 this.salary=salary;
		 this.subject=subject;
		 System.out.println("Salary is"+this.salary+" Subject is "+this.subject);
	 }
	
	 

}
 class Student extends Person{
	 String studentID;
	 public Student(String studentID)
	 {
		 this.studentID=studentID;
		 System.out.println("StudentID is "+this.studentID);
	 }
	 
 }
 class  CollegeStudent extends Student {

	private String collegeName;
	private String year;

	public CollegeStudent(String collegeName, String year, String StudentID) {
		 super(StudentID);
		 this.collegeName=collegeName;
		 this.year=year;
		 System.out.println("Year is "+this.collegeName+" College is "+this.studentID);
		// TODO Auto-generated constructor stub
	}
	 
 }
