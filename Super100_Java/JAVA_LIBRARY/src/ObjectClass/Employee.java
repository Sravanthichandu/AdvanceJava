package ObjectClass;

public class Employee {

	//priate variables
	
	private String name;
	private int id;
	private int salary;
	private String location;
	
	//default constructor
	public Employee()
	{
		
	}
	
	//parameterized constructor
	public Employee(String name,int id,int salary,String location)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.location=location;
	}
	
	//display method
	
	public void display()
	{
		System.out.println("Name of the Employee : "+getname());
		System.out.println("Id of theEmployee : "+getid());
		System.out.println("Salary of the Employee  :" +getsalary());
		System.out.println("Location of the Employee : "+getlocation());
	}
	
	//getters and setters
	
	public void setname(String name)
	{
		 this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void  id(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public int getsalary()
	{
		return salary;
	}
	public void setlocation(String location)
	{
		this.location=location;
	}
	public String getlocation()
	{
		return location;
	}
	
	
	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		Employee e2 = new Employee("Kalyan",654,70000,"Hyderbad");
		Employee e3 = new Employee("Sasi",9872,45000,"Banglore");
		//first and third employee complete information 
		System.out.println("Complete information for Employee1");
		String result1 = e1.toString();
		System.out.println(result1);
		System.out.println("----------------");
		System.out.println("Complete information for Employee2");
		String result2 = e3.toString();
		System.out.println(result2);
		System.out.println("----------------");
		
		//second and third employee details
		
		e2.display();
		System.out.println("--------------------------");
		e3.display();
		
	}

}
