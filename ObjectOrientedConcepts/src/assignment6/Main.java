package assignment6;

import music.string.Veena;
import music.wind.Saxophone;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {	
		Playable vn=new Veena();
		Playable sx=new Saxophone();
		vn.play();
		sx.play();
	}
}
