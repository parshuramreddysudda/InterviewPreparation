import java.util.*;

public class CountUniq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=22665;
		int count=0;
		List<Integer> list=new ArrayList<Integer>();
		   int temp=0;
			while(input>0){
				temp=input%10;
				if(!list.contains(temp)){
					count++;
					list.add(temp);
				}
				input=input/10;
			}
			System.out.println("Count is "+count);
	}
	

}
