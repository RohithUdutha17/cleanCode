package cleancode;

import java.util.List;

public class Cart {
	List<Book> bookDetails;
	
	public Cart(List<Book> bookDetails) {
		this.bookDetails = bookDetails;
	}
	
	public void addAnotherBook() {
		System.out.println("Added another book");
	}
	
	public void deleteBook() {
		System.out.println("Deleted book");
	}
	
	public void proceedToBuy() {
		System.out.println("Taking to payment page");
	}
}
