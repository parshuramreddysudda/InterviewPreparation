import java.util.function.Predicate;
import java.util.ArrayList;
class Assignment5{
	public static void main(String []args){
		
		ArrayList<Integer> arrList=new ArrayList<>();
		arrList.add(64);
		arrList.add(36);
		arrList.add(44);
		arrList.add(296);
		arrList.add(169);
		arrList.add(10);
		arrList.add(25);
		arrList.add(35);
		arrList.add(23);
		arrList.add(81);
		
		Predicate<Integer> p= i->((Math.sqrt(i) - Math.floor(Math.sqrt(i))) == 0)?true : false;
		ArrayList<Integer> res=new ArrayList<>();
		arrList.forEach(
		i->{if(p.test(i))res.add(i);}
		);
		
		System.out.println(res);
		
		
	}
}