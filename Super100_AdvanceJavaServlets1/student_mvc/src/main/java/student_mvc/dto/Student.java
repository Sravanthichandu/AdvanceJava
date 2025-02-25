package student_mvc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {

	private String name,address;
	
	@Id
	@Column(unique=true)
    private String email;
	private String pwd;
	private long phone;
		
	
}
