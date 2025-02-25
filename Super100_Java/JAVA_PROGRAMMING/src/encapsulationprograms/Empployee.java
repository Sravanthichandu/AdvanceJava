package encapsulationprograms;

import java.util.Random;

public class Empployee {
   private String empName;
   private int empId;
   private String designation;
   private String address;
   private long mobilenumber;
   
   Random r= new Random();

   public Empployee() {}
   public Empployee(String empName,String designation,String address,long mobilenumber)
   {
	   this.empName=empName;
	   //this.empId=empId;
	   this.designation=designation;
	   this.address=address;
	   this.mobilenumber=mobilenumber;
   }
   
   //setter and getter method 
   
   public void setname(String empName)
   {
	   this.empName=empName;
   }
   public String getname()
   {
	   return empName;
   }
   public int getempId()
   {
	 empId = r.nextInt(12345);
	 return empId;
	 
   }
   public void setdesignation(String designation)
   {
	   this.designation=designation;
   }
   public String getdesignation()
   {
	   return designation;
   }
   public void setaddress(String address)
   {
	   this.address=address;
   }
   public String getaddress()
   {
	   return address;
   }
   public void setmobilenumber(long mobilenumber)
   {
	   this.mobilenumber=mobilenumber;
   }
   public long getmobilenumber()
   {
	   return mobilenumber;
   }
   
   //display methods 
   public void display()
   {
	   System.out.println("EmpName : "+getname());
	   System.out.println("EmpId : "+getempId());
	   System.out.println("EmpDesignation : "+getdesignation());
	   System.out.println("EmpAddress : "+getaddress());
	   System.out.println("EmpPhoneNumber : "+getmobilenumber());
   }
   
	

}
