package one_to_one_uni.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int p_id;
	String p_name;
	int p_age;
	char p_gender;
	String p_address;
	long p_phone;
	
	/*Cascade -- transform
	 * it is applicable only for owning
	 *  */
	@OneToOne(cascade=CascadeType.ALL	)
	AadharCard a;

	public Person(String p_name, int p_age, char p_gender, String p_address, long p_phone, AadharCard a) {
		super();
		this.p_name = p_name;
		this.p_age = p_age;
		this.p_gender = p_gender;
		this.p_address = p_address;
		this.p_phone = p_phone;
		this.a = a;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_age() {
		return p_age;
	}
	public void setP_age(int p_age) {
		this.p_age = p_age;
	}
	public char getP_gender() {
		return p_gender;
	}
	public void setP_gender(char p_gender) {
		this.p_gender = p_gender;
	}
	public String getP_address() {
		return p_address;
	}
	public void setP_address(String p_address) {
		this.p_address = p_address;
	}
	public long getP_phone() {
		return p_phone;
	}
	public void setP_phone(long p_phone) {
		this.p_phone = p_phone;
	}
	public AadharCard getA() {
		return a;
	}
	public void setA(AadharCard a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", p_name=" + p_name + ", p_age=" + p_age + ", p_gender=" + p_gender
				+ ", p_address=" + p_address + ", p_phone=" + p_phone + ", a=" + a + "]";
	}
	
	
}
