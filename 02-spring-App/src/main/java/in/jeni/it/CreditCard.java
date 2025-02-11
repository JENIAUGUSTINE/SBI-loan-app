package in.jeni.it;

public class CreditCard implements IPayment{

	@Override
	public boolean paymentProcess(double billAmt) {
		System.out.println("CreditCard");
		// TODO Auto-generated method stub
		return true;
	}
	

}
