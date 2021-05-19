package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamString {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Reflection","Collection","Stream","sd");
		
		Long greaterThan5=names.stream().filter(str->str.toString().length()>5).count();
		Long empty=names.stream().filter(str->str.toString().length()==0).count();
		List<String> EmptyStrings=names.stream().filter(str->str.toString().length()==0).collect((Collectors.toCollection(ArrayList::new)));
//		List result = (List) names.stream().filter(s->((String) s).startsWith("S")).collect(Collectors.toList());
		System.out.println("String with length greater than 5 are "+greaterThan5);
		System.out.println("String with empty String "+empty);
	}

}
