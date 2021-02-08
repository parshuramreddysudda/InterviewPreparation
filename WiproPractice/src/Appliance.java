import java.util.Scanner;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class Appliance {

	int appialnceId;
	String applianceName;
	String applCat;
	double appAmount;
	boolean insurance;

	public Appliance(int appialnceId, String applianceName, String applCat, double appAmount) {
		super();
		this.appialnceId = appialnceId;
		this.applianceName = applianceName;
		this.applCat = applCat;
		this.appAmount = appAmount;
	}

	public static double getApplianceAmount(Appliance[] app, int appid, boolean insurance) {

		double newAmount = 0;
		for (int i = 0; i < app.length; i++) {
			if (app[i].getAppialnceId() == appid && insurance) {
				newAmount = app[i].getAppAmount() + ((app[i].getAppAmount() * 20) / 100);
				app[i].setAppAmount(newAmount);
				return newAmount;
			}
		}

		return 0;
	}

	public static Appliance getCostlietsAppliance(Appliance[] app, String appCat) {

		Appliance appId = null;
		for (int i = 0; i < app.length; i++) {
			if (app[i].getApplCat().toLowerCase().equals(appCat.toLowerCase())) {
				double max = 0;
				for (int j = 0; j < app.length; j++) {

					if (max < app[i].getAppAmount()) {
						appId = app[i];
						max = app[i].getAppAmount();
					}
				}
				return appId;

			}
		}
		return null;

	}

	public static void main(String[] args) {

		Appliance[] app = new Appliance[1];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < app.length; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			String cat = sc.next();
			double amt = sc.nextDouble();
			app[i] = new Appliance(id, name, cat, amt);
		}

		System.out.println("Insurance after applying the function is " + getApplianceAmount(app, 112, true));
		Appliance obj = getCostlietsAppliance(app, "asd");
		if(obj != null)
		System.out.println(" App id " + obj.getAppialnceId() + "\n App name " + obj.getApplianceName() + "\n App Cat "
				+ obj.getApplCat() + "\n App price " + obj.getAppAmount());

	}

	public int getAppialnceId() {
		return appialnceId;
	}

	public void setAppialnceId(int appialnceId) {
		this.appialnceId = appialnceId;
	}

	public String getApplianceName() {
		return applianceName;
	}

	public void setApplianceName(String applianceName) {
		this.applianceName = applianceName;
	}

	public String getApplCat() {
		return applCat;
	}

	public void setApplCat(String applCat) {
		this.applCat = applCat;
	}

	public double getAppAmount() {
		return appAmount;
	}

	public void setAppAmount(double appAmount) {
		this.appAmount = appAmount;
	}

	public boolean isInsurance() {
		return insurance;
	}

	public void setInsurance(boolean insurance) {
		this.insurance = insurance;
	}
}
