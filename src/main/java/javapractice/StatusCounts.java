package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatusCounts {

	public static void main(String[] args) {
		List<Order> orders = new ArrayList<Order>();
		orders.addAll(Arrays.asList(new Order(1, 3000, "complete"),
				new Order(1, 3000, "pending"),
				new Order(1, 3000, "pending")));
		Map<String, Integer> result = new HashMap<String, Integer>();
		for(Order order: orders) {
			result.put(order.getStatus(), result.getOrDefault(order.getStatus(), 0)+1);
		}
		System.out.println(result);
	}

}

class Order {
	int id;
	double amt;
	String status;
	public Order(int id, double amt, String status) {
		super();
		this.id = id;
		this.amt = amt;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
