
public class app {
public static void main(String[] args) {
	PaymentService pm = new PaymentService(new DebitCard());
	pm.dopayment(140);
}
}
