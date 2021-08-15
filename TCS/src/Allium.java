
public class Allium {
	private int marketId;
	private String alliumType;
	private String producingState;
	private int price;

	public Allium(int marketId, String alliumType, String producingState, int price) {
		super();
		this.marketId = marketId;
		this.alliumType = alliumType;
		this.producingState = producingState;
		this.price = price;
	}

	public int getMarketId() {
		return marketId;
	}

	public void setMarketId(int marketId) {
		this.marketId = marketId;
	}

	public String getAlliumType() {
		return alliumType;
	}

	public void setAlliumType(String alliumType) {
		this.alliumType = alliumType;
	}

	public String getProducingState() {
		return producingState;
	}

	public void setProducingState(String producingState) {
		this.producingState = producingState;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	  public int compareTo(Allium a,Allium b) {
	        // usually toString should not be used,
	        // instead one of the attributes or more in a comparator chain
		  return a.getPrice()-b.getPrice();
	    }

}
