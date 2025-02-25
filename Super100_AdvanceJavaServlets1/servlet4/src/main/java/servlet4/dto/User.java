package servlet4.dto;

public class User {

	private String name;
	private String email;
	private long phonenumber;
	private int age;
	private String gender;
	private String pwd;
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phonenumber=" + phonenumber + ", age=" + age + ", gender="
				+ gender + ", pwd=" + pwd + "]";
	}
	public User(String name, String email, long phonenumber, int age, String gender, String pwd) {
		super();
		this.name = name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.age = age;
		this.gender = gender;
		this.pwd = pwd;
	}
//	public User(String email, String name, String pwd, long phonenumber, String gender) {
//		super();
//		this.email=email;
//		this.name=name;
//		this.pwd=pwd;
//		this.phonenumber=phonenumber;
//		this.gender=gender;
//	}
	public User() {
		// TODO Auto-generated constructor stub
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
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
	
}
