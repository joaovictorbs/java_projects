package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product() { //construtor padrao
	}
	
	public Product(String name, double price, int quantity) { //construtor
		this.name = name; //referencia o objeto
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { //sobrecarga / mais de uma versao
		this.name = name;
		this.price = price;
		this.quantity = 0;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() { //quantidade e alterada usando o addProducts e removeProducts
		return this.quantity;
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
