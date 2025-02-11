package in.jeni.it.base;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	public Chip() {
		System.out.println("Chip Constructor");
		// TODO Auto-generated constructor stub
	}

	public String processWork() {
		System.out.println();
		return "Jeni";
	}
}
