package Many_to_One_Uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BankAccount {

	@Id
	long bankaccountNumber;
	String bankname,branch,ifscCode;
	long phonenumber;
	
	@ManyToOne
	Person pid;
	
	public BankAccount(long bankaccountNumber, String bankname, String branch, String ifscCode, long phonenumber) {
		super();
		this.bankaccountNumber = bankaccountNumber;
		this.bankname = bankname;
		this.branch = branch;
		this.ifscCode = ifscCode;
		this.phonenumber = phonenumber;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getBankaccountNumber() {
		return bankaccountNumber;
	}
	public void setBankaccountNumber(long bankaccountNumber) {
		this.bankaccountNumber = bankaccountNumber;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "BankAccount [bankaccountNumber=" + bankaccountNumber + ", bankname=" + bankname + ", branch=" + branch
				+ ", ifscCode=" + ifscCode + ", phonenumber=" + phonenumber + "]";
	}
	
	
}
