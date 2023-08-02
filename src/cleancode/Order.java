package cleancode;

import java.util.Date;
import java.util.List;

public class Order {
	long orderId;
	Date orderDate;
	User userDetails;
	List<Book> bookDetails;
	
	public Order(long orderId,Date orderDate,User userDetails,List<Book> bookDetails) {
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.userDetails = userDetails;
		this.bookDetails = bookDetails;
	}
	
	public void confirmOrder() {
		System.out.println("Order confirmed");
	}
}
