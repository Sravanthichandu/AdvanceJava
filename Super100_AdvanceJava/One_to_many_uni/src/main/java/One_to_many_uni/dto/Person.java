package One_to_many_uni.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String pname,pemail,ppswd,paddress;
	long phoneNumber;
	
	/*
	@OneToMany
	BankAccounts  accounts;
	----- exception occurs because in one to many
	we have to give collection of data not single data
	reference
	a person can have more than one accounts
	
	the exception :  org.hibernate.AnnotationException
	so to avoid that we use
	*/
	
	@OneToMany(cascade = CascadeType.ALL)
	List <BankAccounts> accounts;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String pname, String pemail, String ppswd, String paddress, long phoneNumber) {
		super();

		this.pname = pname;
		this.pemail = pemail;
		this.ppswd = ppswd;
		this.paddress = paddress;
		this.phoneNumber = phoneNumber;

	}
	

	public Person(String pname, String pemail, String ppswd, String paddress, long phoneNumber,
			List<BankAccounts> accounts) {
		super();
		this.pname = pname;
		this.pemail = pemail;
		this.ppswd = ppswd;
		this.paddress = paddress;
		this.phoneNumber = phoneNumber;
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", pname=" + pname + ", pemail=" + pemail + ", ppswd=" + ppswd + ", paddress="
				+ paddress + ", phoneNumber=" + phoneNumber + ", accounts=" + accounts + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public String getPpswd() {
		return ppswd;
	}

	public void setPpswd(String ppswd) {
		this.ppswd = ppswd;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<BankAccounts> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccounts> accounts) {
		this.accounts = accounts;
	}
	
	
	
}
