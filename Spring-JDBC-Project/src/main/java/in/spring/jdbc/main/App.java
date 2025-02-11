package in.spring.jdbc.main;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.spring.jdbc.in.UserDAO;
import in.spring.jdbc.in.UserDAOImpl;
import in.spring.jdbc.in.model.User;

public class App {
public static void main(String[] args) {
	ApplicationContext ctxt= new ClassPathXmlApplicationContext("Beans.xml");
	UserDAO userdao = ctxt.getBean(UserDAO.class);
	//Run some tests for JDBC CRUD operations
			User use = new User();
			int rand = new Random().nextInt(1000);
			
		use.setPersonid(101);
		use.setFirstName("JeniJesus");
		use.setLastName("Mary");
		use.setAddress("Ashok Kandhu Salai");
		use.setCity("Jeshwin City");
		
			
			//Create
		userdao.save(use);
}
}
