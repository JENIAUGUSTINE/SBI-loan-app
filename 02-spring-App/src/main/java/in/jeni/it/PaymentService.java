package in.jeni.it;

public class PaymentService {
private IPayment payment;
public PaymentService() {
	// TODO Auto-generated constructor stub
}
public PaymentService(IPayment payment) {
	this.payment=payment;
	// TODO Auto-generated constructor stub
}
public void setPayment(IPayment payment) {
	this.payment=payment;
}
public void doPayment(double billAmt) {
	boolean status = payment.paymentProcess(billAmt);
	if(status)
		System.out.println("Payment Processed");
	else
		System.out.println("Payment Declined");
}
}
