package in.ashok.it;

public class Car {
private IEngine eng;
public Car() {
	// TODO Auto-generated constructor stub
}
public Car(IEngine eng) {
	this.eng=eng;
	// TODO Auto-generated constructor stub
}
public void setEng(IEngine eng) {
	this.eng=eng;
}
public void drive() {
	int status = eng.start();
	if(status >=1)
		System.out.println("Car is satred");
	else
		System.out.println("Car not stared");
}
}
