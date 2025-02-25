package hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee1 {

	@Id
	int id;
	String name;
	String email;
	String password;
	double salary;
	long phone;
}
