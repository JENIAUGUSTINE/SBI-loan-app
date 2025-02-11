package in.jeni.it.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	@Autowired
	private Chip chip;
	public void robot() {
		// TODO Auto-generated method stub
System.out.println("robo obj craeted");
	}
public void doWork() {
	String status = chip.processWork();
	if(status.equals("Jeni")) {
		System.out.println("Success");
	}
	else {
		System.out.println("Failure");
	}
	
}
}
