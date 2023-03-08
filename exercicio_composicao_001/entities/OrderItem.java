package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
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

	public Double subTotal(int quantity, double price) {
		return price * quantity;
	}
	
}
