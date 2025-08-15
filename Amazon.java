package week4.day1;

public class Amazon extends CanaraBank implements Payments {

	public void cashOnDelivery() {
	System.out.println("cashon delivery from Payments Interface");
	}
	public void upiPayments() {
	System.out.println("upipayments from payments interface");
	}
	public void cardPayments() {
    System.out.println("cardpayments from payments interface");
	}
	public void internetBanking() {
	System.out.println("internet bankng from payments interface");
	}
	@Override
	public void recordPaymentDetails() {
	System.out.println("recordpaymentdetails from canarabank abstractclass");
	}
public static void main(String[] args) {
	Amazon a = new Amazon();
	a.cashOnDelivery();
	a.upiPayments();
	a.cardPayments();
	a.internetBanking();
	a.recordPaymentDetails();
}
}
