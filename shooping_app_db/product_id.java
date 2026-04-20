package shooping_app_db;

public class product_id {
	
	int id;
	String name;
	int quantity;
	double price;
	
	product_id()
	{
		
	}

	public product_id(int id, String name, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "product_id [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	

}
