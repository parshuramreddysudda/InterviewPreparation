import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Assignment7 {

	public Assignment7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrList=new ArrayList<>();
		arrList.add(64);
		arrList.add(39);
		arrList.add(47);
		arrList.add(20);
		arrList.add(169);
		arrList.add(10);
		arrList.add(25);
		arrList.add(98);
		arrList.add(28);
		arrList.add(86);
		
		Predicate<Integer> i=p->p%2==0;
		Consumer<ArrayList<Integer>> con=all->all.forEach(num->System.out.println(num+(i.test(num)?" even":" odd")));

	}

}
