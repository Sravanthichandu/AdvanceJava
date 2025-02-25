package Many_to_One_Uni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*In many to one person is non-owning and bankaccounts class is owning*/

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int pid;
	String name,email,pswd,address;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String name, String email, String pswd, String address) {
		super();
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.pswd = pswd;
		this.address = address;
	}
	
	
}
