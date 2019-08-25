public class Product {
	private double price;
	private String name;
	private int quantityLeft;
	
	public Product(double p, String n, int q) {
		// TODO Auto-generated constructor stub
		setPrice(p);
		setName(n);
		setQuantityLeft(q);
	}

	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getQuantityLeft() {
		return quantityLeft;
	}
	
	public void setPrice(double p) {
		price = Math.abs(p);
	}
	
	public void setName(String n) {
		if(n == null)
			name = "no name";
		else
			name = n;
	}
	
	public void setQuantityLeft(int q) {
		quantityLeft = Math.abs(q);
	}

	public double totalStockPrice() {
		// TODO Auto-generated method stub
		return price * quantityLeft;
	}
	
	public String toString() {
		return quantityLeft+" pieces of "+name+" @"+price+" left";
	}
}
