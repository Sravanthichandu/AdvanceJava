package One_to_many_uni.dto;

import javax.persistence.Entity;

import javax.persistence.Id;



@Entity
public class BankAccounts {

	@Id
	long bankAccountNumber;
	String bankName,ifscCode,branch;
	public BankAccounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccounts(long bankAccountNumber, String bankName, String ifscCode, String branch) {
		super();
		this.bankAccountNumber = bankAccountNumber;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.branch = branch;
	}
	public long getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "BankAccounts [bankAccountNumber=" + bankAccountNumber + ", bankName=" + bankName + ", ifscCode="
				+ ifscCode + ", branch=" + branch + "]";
	}
	
	
}
