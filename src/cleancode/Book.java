package cleancode;

public class Book {
	String bookName;
	String author;
	String bookId;
	double price;
	
	public Book(String bookName,String author,String bookId,double price) {
		this.bookName = bookName;
		this.author = author;
		this.bookId = bookId;
		this.price = price;
	}
	
	public void addBookToCart() {
		System.out.println("Book added to cart successfully");
	}
	
	public void viewBooks() {
		System.out.println("Viewing Books");
	}
	
	public void downloadBooks() {
		System.out.println("Books downloaded");
	}
}
