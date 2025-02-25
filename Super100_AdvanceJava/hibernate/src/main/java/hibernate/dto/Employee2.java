package hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee2 {

	int id;
	@Id
	String name;
	String email;
	String password;
	double salary;
	long phone;
}
