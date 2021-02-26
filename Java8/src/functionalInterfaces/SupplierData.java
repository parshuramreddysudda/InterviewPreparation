package functionalInterfaces;

import java.util.function.Function;
import java.util.function.Supplier;

public class SupplierData {

	public static void main(String[] args) {
		Supplier<Double> sup = () -> Math.random();

		System.out.println(sup.get());

		Function<String, String> replaceStr = str -> {
			System.out.println("Called ReplaceSTR");
			return str.replace("=", ":");
		};
		Function<String, String> addColon = str -> {
			System.out.println("Called addColon");
			return "{" + str + "}";
		};
		
		System.out.println(replaceStr.andThen(addColon).apply("Key:value:json"));
		System.out.println(addColon.compose(replaceStr).apply("JSOn:langauge:key"));

	}

}
