package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product(String name, double price, int quantity) { //construtor
		this.name = name; //referencia o objeto
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return this.price * this.quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name 
			+ ", $" 
			+ String.format("%.2f", price) 
			+ ", " 
			+ quantity
			+ " units, Total: $"
			+ String.format("%.2f", totalValueInStock());
	}
}
