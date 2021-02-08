import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author parsh
 *
 */
public class MaterialManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bottle[] bottle = new Bottle[2];
		for (int i = 0; i < bottle.length; i++) {
			int bottleId = sc.nextInt();
			String bottleBrand = sc.next();
			String bottleType = sc.next();
			int capacity = sc.nextInt();
			String material = sc.next();
			double price = sc.nextDouble();
			bottle[i] = new Bottle(bottleId, bottleBrand, bottleType, capacity, material, price);
		}
		String parameter1 = sc.next();
		String parameter2 = sc.next();
		sc.close();

		int getavg = getAvgPriceBasedOnMaterial(bottle, parameter1);
		if (getavg == 0) {
			System.out.println("There is no matching bottles with the given material");
		} else {
			System.out.println(getavg);
		}

		Bottle gb = getBottleBySecondHighestPrice(bottle, parameter2);
		if (gb == null) {
			System.out.println("Bottles are not available for the given brand");
		} else {
			System.out.println("Bottle Name is"+gb.getBottleBrand() + " : " + gb.getCapacity() + " : " + gb.getPrice());
		}
	}

	private static Bottle getBottleBySecondHighestPrice(Bottle[] bottle, String brand) {

		int count = 0;
		int loop = 0;
		double[] price = new double[bottle.length];
		for (int i = 0; i < bottle.length; i++)
			if (bottle[i].getBottleBrand().equals(brand))
				price[loop++] = bottle[i].getPrice();

		Arrays.sort(price);
		for (int i = 0; i < bottle.length; i++)
			if (price[1] == bottle[i].getPrice() && brand.equals(bottle[i].getBottleBrand()))
				return bottle[i];

		return null;
	}

	private static int getAvgPriceBasedOnMaterial(Bottle[] bottle, String parameter1) {
		// TODO Auto-generated method stub
		int sum = 0, count = 0;
		for (int i = 0; i < bottle.length; i++) {
			if (parameter1.equalsIgnoreCase(bottle[i].getMaterial())) {
				sum = (int) (sum + bottle[i].getPrice());
				count++;
			}
		}

		if (count == 0)
			return 0;
		else
			return sum / count;
	}

}

class Bottle {
	public int length;
	private int bottleId;
	private String bottleBrand;
	private String bottleType;
	private int capacity;
	private String material;
	private double price;

	Bottle(int bottleId, String bottleBrand, String bottleType, int capacity, String material, double price) {
		this.bottleId = bottleId;
		this.bottleBrand = bottleBrand;
		this.bottleType = bottleType;
		this.capacity = capacity;
		this.material = material;
		this.price = price;

	}

	public int getBottleId() {
		return bottleId;
	}

	public void setBottleId(int bottleId) {
		this.bottleId = bottleId;
	}

	public String getBottleBrand() {
		return bottleBrand;

	}

	public void setBottleBrand(String bottleBrand) {
		this.bottleBrand = bottleBrand;
	}

	public String getBottleType() {
		return bottleType;

	}

	public void setBottleType(String bottleType) {
		this.bottleType = bottleType;

	}

	public int getCapacity() {
		return capacity;

	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
