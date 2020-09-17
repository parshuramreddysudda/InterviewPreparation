import Automobile.Hero;
import Automobile.Honda;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hero hero = new Hero("Glamour 125", "WB16G1234", "Bob Biswas", 85);
		hero.getModelName();
		hero.getOwnerName();
		hero.getRegistrationNumber();
		hero.getSpeed();
		hero.radio();
		
		System.out.println();
		
		Honda honda = new Honda("Honda City", "WB18G7777", "Prodosh Mitra", 110);
		honda.getModelName();
		honda.getOwnerName();
		honda.getRegistrationNumber();
		honda.getSpeed();
		honda.cdplayer();

	}


}
