/**
 * 
 */
package graduate;

/**
 * @author Bachina Akhila
 *
 */

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Student class which defines basic behavior of student as intended.
 * 
 * @see Student.java
 * @version 1.0
 * @author AkhilaBachina
 * @since 07-Jan-2022 
 *
 */
public class Student {
	String studentId;
	String studentName;
	int age;
	int grade;
	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the studentId
	 */
	public void grade(int grade)
	{
		if(grade<0||grade<100)
		{
			System.out.println("grade has passed");
		}
		else
		{
			this.grade=grade;
		}
	}
	public void GraduateStudent( String stdentName, String studentId, int grade, int age)
	{
		this.setStudentName(stdentName);
		this.setStudentId(studentId);
		this.setGrade(grade);
		this.setAge(age);
	}
	public void  underGraduateStudent( String stdentName, String studentId, int grade, int age)
	{
		this.setStudentName(stdentName);
		this.setStudentId(studentId);
		this.setGrade(grade);
		this.setAge(age);
	}
	public boolean isPassed(int grade)
	{
		return true;
	}
	public void collectResult()
	{
		LocalDate currentDate=(LocalDate.now()).plusDays(5);
		LocalTime currentTime=(LocalTime.now()).plusHours(4);
		System.out.printf("You can come and collect your detailed marks sheet on %d-%s-%d at %d:%d %s%n%n",
				currentDate.getDayOfMonth(), currentDate.getMonth(), currentDate.getYear(),
				(currentTime.getHour() > 12 ? currentTime.getHour() - 12 : currentTime.getHour()),
				currentTime.getMinute(), (currentTime.getHour() > 12 ? "PM" : "AM"));
	}
}
	
	
