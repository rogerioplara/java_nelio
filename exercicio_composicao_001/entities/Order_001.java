package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus_001;

public class Order_001 {
	
	private LocalDateTime moment;
	private OrderStatus_001 status;
	
	private List<OrderItem> items = new ArrayList<>(); 
	
	public Order_001() {
		
	}

	public Order_001(LocalDateTime moment, OrderStatus_001 status) {
		this.moment = moment;
		this.status = status;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus_001 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus_001 status) {
		this.status = status;
	}

	public List<OrderItem> getItem() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
}
