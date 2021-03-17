package streams;

import java.util.Comparator;
import java.util.List;

public class StreamsDemo {

	public StreamsDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		var movies = List.of(new Movies("a", 10),new Movies("b", 20),new Movies("c", 30));
		var result=movies.stream().allMatch(m->m.getLikes()<4020);
		var result1=movies.stream().max(Comparator.comparing(Movies::getLikes)).get();
		System.out.println(result1.getLikes());
	}

}
