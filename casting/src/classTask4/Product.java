package classTask4;

public class Product extends Market{
	private String name;
	private int price;
	private int inventory;
	
	public Product() {;}

	public Product(String name, int price, int inventory) {
		super();
		this.name = name;
		this.price = price;
		this.inventory = inventory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	};
}
