import java.util.ArrayList;
import java.util.function.Predicate;
class Employeee{
	private int id;
	private String name;
	private double salary;
	 Employeee(int id,String name, double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	public String getName(){
		return name;
	}
}


class Assignment4{
	public static void main(String []args){
		
		ArrayList<Employeee> arrList=new ArrayList<>();
		arrList.add(new Employeee(101,"Sachin",20000));
		arrList.add(new Employeee(102,"Kohli",5000));
		arrList.add(new Employeee(103,"Dhoni",58000));
		arrList.add(new Employeee(104,"Raina",97000));
		arrList.add(new Employeee(105,"Rahul",40000));
		arrList.add(new Employeee(104,"Rohit",9800));
		arrList.add(new Employeee(105,"Sehwag",9000));
		
		Predicate<Double> p= i->i<10000;
		ArrayList<String> res=new ArrayList<>();
		arrList.forEach(
		i->{if(p.test(i.getSalary()))res.add(i.getName());}
		);
		
		System.out.println(res);
		
		
	}
}