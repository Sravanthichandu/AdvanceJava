package Student.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int stdId;

private String stdName;

@Column(unique=true)
private String stdEmail;

private long stdPhoneNumber;

private String stdPassword;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(String stdName, String stdEmail, long stdPhoneNumber, String stdPassword) {
	super();
	this.stdName = stdName;
	this.stdEmail = stdEmail;
	this.stdPhoneNumber = stdPhoneNumber;
	this.stdPassword = stdPassword;
}

public int getStdId() {
	return stdId;
}

public String getStdName() {
	return stdName;
}

public void setStdName(String stdName) {
	this.stdName = stdName;
}

public String getStdEmail() {
	return stdEmail;
}

public void setStdEmail(String stdEmail) {
	this.stdEmail = stdEmail;
}

public long getStdPhoneNumber() {
	return stdPhoneNumber;
}

public void setStdPhoneNumber(long stdPhoneNumber) {
	this.stdPhoneNumber = stdPhoneNumber;
}

public String getStdPassword() {
	return stdPassword;
}

public void setStdPassword(String stdPassword) {
	this.stdPassword = stdPassword;
}

@Override
public String toString() {
	return "studentId:" + stdId + "\nstudentName:" + stdName + "\nstudentEmail=" + stdEmail + "\nstudentPhoneNumber:"
			+ stdPhoneNumber + "\n studentPassword:" + stdPassword + "";
}




}
