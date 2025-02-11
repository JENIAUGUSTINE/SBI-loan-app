package in.jeni.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private int id;
	private String firstName;
	private String LastName;
	private String address;
	private String city;
	}
