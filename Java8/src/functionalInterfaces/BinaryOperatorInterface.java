package functionalInterfaces;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import com.data.student.Student;
import com.data.student.StudentDataBase;

public class BinaryOperatorInterface {

	public BinaryOperatorInterface() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BinaryOperator<Integer> add = (a, b) -> a + b;
		Function<Integer,Integer> square=a->a*a;
		System.out.println(add.andThen(square).apply(45, 56));
		List<Student> list=StudentDataBase.getAllStudents();
		Predicate<Student> grade=gre->gre.getGradeLevel()>3;
		long count=list.stream().filter(grade).count();
		System.out.println(count);
	}

}
