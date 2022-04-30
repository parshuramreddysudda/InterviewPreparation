package aircraft;

public class Aircraft {

	int aircraftId;
	AircraftManufacturer aircraftManufacturerInstance;
	String model;

	public Aircraft(int aircraftId, AircraftManufacturer aircraftManufacturerInstance, String model) {
		super();
		this.aircraftId = aircraftId;
		this.aircraftManufacturerInstance = aircraftManufacturerInstance;
		this.model = model;
	}

	public int getAircraftId() {
		return aircraftId;
	}

	public void setAircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}

	public AircraftManufacturer getAircraftManufacturerInstance() {
		return aircraftManufacturerInstance;
	}

	public void setAircraftManufacturerInstance(AircraftManufacturer aircraftManufacturerInstance) {
		this.aircraftManufacturerInstance = aircraftManufacturerInstance;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
