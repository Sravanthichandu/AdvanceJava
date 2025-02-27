package hibernate_user.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//encapsulated class hibernate framework convert class into a table by using @entity

@Entity
public class User {

	//private members
	@Id
	private int uID;
	private String name;
	
	private String email;
	private String password;
	private long phone;
	
	//non argumented constructor
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	//argumented constructor
	
	public User(int uID, String name, String email, String password, long phone) {
		super();
		this.uID = uID;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	//override to string instead of printing object address need object values/data
	
	@Override
	public String toString() {
		return "\nUserID:" + uID + "\nname:" + name + "\nemail:" + email + "\npassword:" + password + "\nphone:"
				+ phone + "";
	}


	//setters and getters
	
	public int getuID() {
		return uID;
	}

	public void setuID(int uID) {
		this.uID = uID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	
	
   
	
	
	
	
	
}

/*
 * class-------------------------------table
 * datamembers/properties -------------columns
 * Identifier -------------------------primary key
 * object------------------------------row
 * */