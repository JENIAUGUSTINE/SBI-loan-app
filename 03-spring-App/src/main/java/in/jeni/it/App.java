package in.jeni.it;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
	UserService userservice=con.getBean(UserService.class);
	UserService userservice1=con.getBean(UserService.class);
	userservice.printName(1);
	System.out.println(userservice.hashCode());
	System.out.println(userservice1.hashCode());
}
}
