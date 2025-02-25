package servlet_dynamic_maven2.model;

import lombok.Data;

@Data
public class Demo {
	String email,Pwd,address;
	long phone;
	

}
/**<a href="fifth?email=dinga2@gmail.com&Pwd=123&phone=789543214&address=Hyd">FiFth Request</a>
 * these key names and datamembers names should be same
 * to avoid getters,setters,toString like these use @Data annotation*/
/*output : Demo(email=dinga2@gmail.com, Pwd=123, address=Hyd, phone=789543214)*/
