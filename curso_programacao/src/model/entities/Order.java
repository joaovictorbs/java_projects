package model.entities;

import model.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private OrderStatus status;

    private Client client;
    private List<OrderItem> itens = new ArrayList<>(); //lista de itens de um pedido

    public Order() {}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
        this.status = status;
        this.client = client;
	}

	public Date getDate() {
		return moment;
	}

	public void setDate(Date moment) {
		this.moment = moment;
	}

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderStatus getStatus() {
		return status;
	}

    public List<OrderItem> getItens() {
        return itens;
    }

	public void setProduct(OrderStatus status) {
		this.status = status;
	}

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removeItem(OrderItem item) {
        itens.remove(item);
    }

    public Double total() {

        double sum = 0;
        for (OrderItem item : itens) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client);
        sb.append("Order items: \n");
        for (OrderItem item : itens) {
            sb.append(item);
        }
        sb.append("Total price: $" + String.format("%.2f",this.total()));


        return sb.toString();
    }
}
