package arrays;

public class Main {

	public static void main(String[] args) {
		Arrays arr=new Arrays(4);
		arr.insert(452);arr.insert(465);arr.insert(452);arr.insert(455);
		arr.insert(34545);
		arr.print();
		arr.removeAt(3);

	}

}
