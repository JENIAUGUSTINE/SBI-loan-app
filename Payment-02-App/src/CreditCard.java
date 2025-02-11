
public class CreditCard implements IPayment {

	@Override
	public boolean processPayment(double billamt) {
		// TODO Auto-generated method stub
		System.out.println("Credit Card Payment");
		return true;
	}

}
