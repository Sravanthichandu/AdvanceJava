package servlet_dynamic_maven;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo 
{
 @Id
 int id;
 String name;
}
