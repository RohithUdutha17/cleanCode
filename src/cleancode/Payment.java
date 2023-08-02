package cleancode;

public class Payment {
	String paymentId;
	double amount;
	public Payment(String paymentId,double amount) {
		this.paymentId = paymentId;
		this.amount =amount;
	}
	
	public void makePayment() {
		System.out.println("Payment successfull taking you to order confirmation page");
	}
}
