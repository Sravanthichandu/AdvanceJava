package one_to_one_uni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AadharCard {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int a_id;
	String a_Fathername;
	String a_Mothername;
	String dateOfBirth;
	String address;
	@Id
	long aadharNumber;
	public AadharCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AadharCard(String a_Fathername, String a_Mothername, String dateOfBirth,
			String address, long aadharNumber) {
		super();
		this.a_Fathername = a_Fathername;
		this.a_Mothername = a_Mothername;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.aadharNumber = aadharNumber;
	}
	
	public String getA_Fathername() {
		return a_Fathername;
	}
	public void setA_Fathername(String a_Fathername) {
		this.a_Fathername = a_Fathername;
	}
	public String getA_Mothername() {
		return a_Mothername;
	}
	public void setA_Mothername(String a_Mothername) {
		this.a_Mothername = a_Mothername;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	@Override
	public String toString() {
		return "AadharCard [a_id=" + a_id + ", a_Fathername=" + a_Fathername + ", a_Mothername=" + a_Mothername
				+ ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", aadharNumber=" + aadharNumber + "]";
	}

	
}
