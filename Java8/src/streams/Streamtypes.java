package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.data.student.Bike;
import com.data.student.Student;
import com.data.student.StudentDataBase;

public class Streamtypes {

	public Streamtypes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//		Arrays.stream(array)
//		List<Integer> list;list.stream();
//	      	var stream = Stream.generate(() -> Math.random());
		Student stu = new Student();
		var student = List.of(
				new Student("Adam", 2432, 3213.6, "male", 130, Arrays.asList("swimming", "basketball", "volleyball")),
				new Student("Adam", 2132, 321.126, "male", 10, Arrays.asList("swimming", "basketball", "volleyball")),
				new Student("Adam", 4352, 324.6, "male", 1340, Arrays.asList("swimming", "basketball", "volleyball")),
				new Student("Adam", 452, 3123.6, "male", 1670, Arrays.asList("swimming", "basketball", "volleyball")));

//		.sorted((a, b) -> a.getName().compareTo(b.getName()))
		student.stream().forEach(a -> System.out.println(a.getName()));

	}

}
