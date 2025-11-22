package entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(){}

    public OrderItem(Integer quantity, Double price, Product product) {
        this.setQuantity(quantity);
        this.setPrice(price);
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal() {
        return quantity * price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(product.getName() + ", $" + price + " Quantity: " + quantity + ", Subtotal: " + String.format("%.2f",this.subTotal()) + "\n");

        return sb.toString();
    }
}
