package maven_hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //create table 
public class User {
    @Id //make id as primary key
	int id;
	String name;
	//if u want to make email as primary key use @Id on before email
	String email;
	long phone;
}

/* @Id -- used to make column as Primary key
 * @Entity -- used to create table
 * */
 