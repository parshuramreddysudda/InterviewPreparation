package assignment1;

public class Item {
	int id;
	String name;
	int cost;
	int available;

	public Item(int id, String name, int cost, int available) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.available = available;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCostl(int cost) {
		this.cost = cost;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", cost=" + cost + ", available=" + available + "]";
	}

}
