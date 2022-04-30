package aircraft;

public class AircraftManufacturer {

	int aircraftmanufaturerId;
	String name;

	public AircraftManufacturer(int aircraftmanufaturerId, String name) {
		super();
		this.aircraftmanufaturerId = aircraftmanufaturerId;
		this.name = name;
	}

	public int getAircraftmanufaturerId() {
		return aircraftmanufaturerId;
	}

	public void setAircraftmanufaturerId(int aircraftmanufaturerId) {
		this.aircraftmanufaturerId = aircraftmanufaturerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
