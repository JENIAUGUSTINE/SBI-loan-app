package in.jeni.it;

public class UserService {
private UserDAO user;

public UserService() {
	// TODO Auto-generated constructor stub
}

public UserService(UserDAO user) {
	this.user=user;
	// TODO Auto-generated constructor stub
}

public void printName(int id) {
	String status=user.findName(id);
	if(status.equals("Jeni"))
		System.out.println("PrintName :: " +status);
	else
		System.out.println("No Name Found Exception");

}
}
