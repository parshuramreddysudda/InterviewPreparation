package assignment5;

public class Main {


	public static void main(String[] args) {
		Instrument[] obj= {new Guitar(),new Piano(),new Flute(),new Guitar(),new Piano(),new Guitar(),new Piano(),new Flute()};
		
		for(int i=0;i<obj.length;i++)
			obj[i].play();
	}

}
