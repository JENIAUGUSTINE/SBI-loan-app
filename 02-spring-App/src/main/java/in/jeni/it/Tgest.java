package in.jeni.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tgest {
public static void main(String[] args) {
	ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
	PaymentService pay =con.getBean(PaymentService.class);
	pay.doPayment(400.00);
}
}
