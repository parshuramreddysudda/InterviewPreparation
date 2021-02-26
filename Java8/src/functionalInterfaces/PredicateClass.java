package functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.data.student.Student;
import com.data.student.StudentDataBase;

public class PredicateClass {


	public static void main(String[] args) {
		 
		Predicate<Integer> p1=(a)-> a%2==0;
		Predicate<Integer> p2=(a)-> a/2==10;
		System.out.println(p1.or(p2).test(100));  //And condition
		System.out.println(p1.and(p2).test(100)); //Or condition
		System.out.println(p1.negate().test(45)); // reverse the answer
		Predicate<Student> student=(s)->s.getGradeLevel()>=4;
		List<Student> list=StudentDataBase.getAllStudents();
		list.forEach(studen->{
			if (student.test(studen)) {
				System.out.println(studen);
			}
		});
		for(int i=0;i<100;i++)
		   if(p1.test(i))
			   System.out.println(i);
	}
}
