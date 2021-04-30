package springdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class StudentDatabase {

	static List<StudentClass> students = new ArrayList<StudentClass>();

	public StudentDatabase() {

		for (int i = 0; i < 100; i++)
			students.add(new StudentClass(i, "Person" + i, "Address" + Math.random() * 100));

	}

	@TrackExecutionTime
	public void getDetails() {

		Iterator<StudentClass> it = students.iterator();
		while (it.hasNext()) {
			StudentClass stu = it.next();
			 System.out.println(" ID :" + stu.getId() + " Name :" + stu.getName() + "Address :" + stu.getAddress());
		}

	}

	@TrackExecutionTime
	public void getStudent(int id) {
		System.out.print("Result is :");
		
		if (students.get(id) == null)
			System.out.println("No movie found");
		for (StudentClass student : students) {
			if (student.getId() == id)
				System.out.println(" ID :" + student.getId() + " Name :" + student.getName() + " Address :"
						+ student.getAddress());
		}
	}

}
