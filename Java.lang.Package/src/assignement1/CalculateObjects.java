package assignement1;

public class CalculateObjects {

	static int NoOfObjects=0;
	
	
	
	public CalculateObjects() {
		NoOfObjects++;
	}



	public static void main(String[] args) {

		CalculateObjects c1=new CalculateObjects();
		System.out.println("Objecta are "+c1.NoOfObjects);
		CalculateObjects c2=new CalculateObjects();
		CalculateObjects c3=new CalculateObjects();
		System.out.println("Objecta are "+c1.NoOfObjects);
		CalculateObjects c4=new CalculateObjects();
		CalculateObjects c5=new CalculateObjects();
		System.out.println("Objecta are "+c3.NoOfObjects);
		

	}

}
