import java.io.Serializable;
import java.util.Random;;

public class EmplyeeBean implements Serializable {
	
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return id;
	}
	public void setD(int id) {
		this.id = id;
	}
	public double getSalary() {
		return 20000*new Random(545346).nextDouble();
	}
	
}
