
public class Car {
	private IEngine e;
	public Car(IEngine e) {
		this.e=e;
		// TODO Auto-generated constructor stub
	}
	
//	public void setEng(IEngine e) {
//		this.e = e;
//	}
public void drive() {
	int status = e.start();
	if(status>=1)
		System.out.println("Car Started");
	else
		System.out.println("Not Started");
}
}
