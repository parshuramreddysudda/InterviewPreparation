import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment3 {

	public Assignment3() {

	}

	public static void main(String args[]) {
		ArrayList<Student> stu = new ArrayList<Student>(5);
		stu.add(new Student(1, "Ram", 5));
		stu.add(new Student(2, "Vamsi", 100));
		stu.add(new Student(3, "Rohit", 53));
		stu.add(new Student(4, "Vishnu", 84));

		List<Student> filteredList = stu.stream().filter(stud -> stud.mark > 50).collect(Collectors.toList());

		System.out.println("Numberr of passed Students " + filteredList.size());
		
		System.out.println("Id \t Name \t Age \t");
		filteredList.forEach(student->{
			System.out.println(student.rollNo+"\t"+student.name+"\t"+student.mark+"\t");
		});
	}
}

class Student {

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Student(int rollNo, String name, int mark) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mark = mark;
	}

	public int rollNo;
	public String name;
	public int mark;

}