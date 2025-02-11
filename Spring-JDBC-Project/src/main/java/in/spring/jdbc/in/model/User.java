package in.spring.jdbc.in.model;

public class User {

public int getPersonid() {
	return Personid;
}
public void setPersonid(int personid) {
	Personid = personid;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
private int Personid;
private String LastName;
private String FirstName;
private String Address;
private String City;
@Override
public String toString() {
	return "User [Personid=" + Personid + ", LastName=" + LastName + ", FirstName=" + FirstName + ", Address=" + Address
			+ ", City=" + City + "]";
}
}
