package spring_annotation_student.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("1")
	private int stdId;
	@Value("Harini")
	private String name;
	@Value("H@gamil.com")
	private String email;
	@Value("9871243562")
	private long phoneNumber;
	
	@Autowired
	AadharCard aadhar;

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", aadhar=" + aadhar + "]";
	}
	
	
	
	
}
