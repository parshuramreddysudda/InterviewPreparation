package assignment3;

import automobile.Honda;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Honda honda = new Honda("Honda City", "WB18G7777", "Prodosh Mitra", 110);
		honda.getModelName();
		honda.getOwnerName();
		honda.getRegistrationNumber();
		System.out.println(honda.getSpeed());
		honda.cdplayer();
	}

}
