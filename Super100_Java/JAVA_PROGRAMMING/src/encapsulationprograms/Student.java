package encapsulationprograms;

public class Student {
 
      private String name;
      private int rollNo;
      private int marks;
      private char gender;
      private long mobilenumber;
      
      public Student() {}
      public Student(String name,int rollNo,int marks,char gender,long mobilenumber)
      {
    	  this.name=name;
    	  this.rollNo=rollNo;
    	  this.marks=marks;
    	  this.gender=gender;
    	  this.mobilenumber=mobilenumber;
      }
      
      public void setname(String name)
      {
    	  this.name=name;
      }
	  public String getname()
	  {
		  return name;
	  }
	  public void setrollNo(int rollNo)
	  {
		  this.rollNo=rollNo;
	  }
	  public int getrollNo()
	  {
		  return rollNo;
	  }
	  public void setMarks(int marks)
	  {
		  this.marks=marks;
	  }
	  public int getMarks()
	  {
		  return marks;
	  }
	  public void setGender(char gender)
	  {
		  this.gender=gender;
	  }
	  public char getGender()
	  {
		  return gender;
	  }
	  public void setMobileNumber(int mobilenumber)
	  {
		  this.mobilenumber=mobilenumber;
	  }
	  public long getMobileNumber()
	  {
		  return mobilenumber;
	  }
	  public void display()
	  {
		  System.out.println("Name of the Student : "+getname());
		  System.out.println("RollNo of the Student : "+getrollNo());
		  System.out.println("marks of the Student : "+getMarks());
		  System.out.println("gender of the student : "+getGender());
		  System.out.println("MobileNumber of the student : "+getMobileNumber());
	  }
}
