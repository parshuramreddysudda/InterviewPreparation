import music.Playable;
import music.Saxophone;
import music.Veena;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Test {
	public static void main(String[] args) {
		Playable veena = new Veena();
		veena.play();
		
		Playable saxophone = new Saxophone();
		saxophone.play();
	}
}

