package hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee3 {

	int id;
	String name;
	@Id
	String email;
	String password;
	double salary;
	long phone;
}
