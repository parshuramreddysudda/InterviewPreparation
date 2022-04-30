package Laptop;

class Laptop {
	private int price;
	private String details;

	public Laptop(String details, int price) {
		this.details = details;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}

class Afford {

	public String checkConfiguration(Laptop laptop) throws LaptopException {

		if (laptop.getPrice() > 70000) {
			throw new LaptopException("Price is too high");
		}

		String[] strArray = laptop.getDetails().split("/", 3);
		if (Integer.parseInt(strArray[0]) < 8) {
			throw new LaptopException("Minimum 8 RAM required");
		}

		if (Integer.parseInt(strArray[1]) < 256) {
			throw new LaptopException("Minimum 256 space required");
		}

		if (strArray[2].equalsIgnoreCase("HDD")) {
			throw new LaptopException("SSD Required");
		}

		return "Can be purchased";

	}

	public String purchaseLaptop(Laptop laptop) throws LaptopException {

		try {
			checkConfiguration(laptop);

		} catch (LaptopException lap) {
				return "Change Configuration";
		}
		catch (Exception e) {
			return "Other Exception";
	}
		return "Perfect Configuration";
	}

}

class LaptopException extends Exception {

	public LaptopException(String errorMessage) {
		super(errorMessage);
	}

}

public class Source {

	public static void main(String[] args) throws Exception {
		Laptop laptop = new Laptop("8/2/SSD", 58000);
		Afford af = new Afford();
		String s = af.checkConfiguration(laptop);
		String t = af.purchaseLaptop(laptop);
		s.toLowerCase();
		t.toLowerCase();
		System.out.println(t);

	}

}
