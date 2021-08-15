package painting;

public class Painting {
	private int paintingId;
	private String paintingName;
	private int price;
	private String type;
	private String painterName;
	
	
	
	public Painting(int paintingId, String paintingName, int price, String type, String painterName) {
		super();
		this.paintingId = paintingId;
		this.paintingName = paintingName;
		this.price = price;
		this.type = type;
		this.painterName = painterName;
	}



	@Override
	public String toString() {
		return "Painting [paintingId=" + paintingId + ", paintingName=" + paintingName + ", price=" + price + ", type="
				+ type + ", painterName=" + painterName + "]";
	}



	public int getPaintingId() {
		return paintingId;
	}



	public void setPaintingId(int paintingId) {
		this.paintingId = paintingId;
	}



	public String getPaintingName() {
		return paintingName;
	}



	public void setPaintingName(String paintingName) {
		this.paintingName = paintingName;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getPainterName() {
		return painterName;
	}



	public void setPainterName(String painterName) {
		this.painterName = painterName;
	}
	
	

}
