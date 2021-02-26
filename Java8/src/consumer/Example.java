package consumer;

import java.util.List;
import java.util.function.Consumer;

import com.data.student.Student;
import com.data.student.StudentDataBase;

public class Example {
	
	 static Consumer<Student> printStudent=(s)->System.out.println(s);
	 static Consumer<Student> getStudents=(s)->System.out.println(s.getName());
	 static Consumer<Student> getActivities=(s)->System.out.println(s.getActivities());
	 static Consumer<Student> getGrade=(s)->System.out.println(s.getGradeLevel());
	
	 
	 
	public static void main(String[] args) {
		 List<Student> list=StudentDataBase.getAllStudents();
//		 list.forEach(printStudent);
		 
		 list.forEach(student->{
			 if(student.getGpa()>3) {
				 getStudents.andThen(getGrade).accept(student);
			 }
		 });
		 
		 

	}

}
