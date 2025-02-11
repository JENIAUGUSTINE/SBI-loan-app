package in.jeni.it;

public class DebitCard implements IPayment{

	@Override
	public boolean paymentProcess(double billAmt) {
		System.out.println("DebitCard");
		// TODO Auto-generated method stub
		return true;
	}
	

}
