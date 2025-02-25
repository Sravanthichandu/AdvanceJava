package constructors;

public class Employee {
	
	String name;
	int id;
	double salary;
	
	public Employee(String name , int id , double salary)
	{
		if(validateName(name)&& validateId(id) && validateSalary(salary))
		{
			this.name=name;
			this.id = id;
			this.salary=salary;
			
		}
		else
		{
			System.out.println("Invalid Data");
		}
			
		
	}
	public boolean validateName(String name)
	{
		if(name.equalsIgnoreCase("Ram")||name.equalsIgnoreCase("bheem")||name.equalsIgnoreCase("Shyam"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateId(int id)
	{
		if(id%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateSalary(double salary)
	{
		if(salary>=25000 && salary<=100000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		System.out.println("Name of the Employee         : "+name);
		System.out.println("id of the Employee           : "+id);
		System.out.println("salary of the Employee       : "+salary);
		System.out.println("Annual salary of the Employee : "+(salary*12));
		System.out.println("-------------------------------------------------");
		
	}

	public static void main(String[] args) {
		
    
	}

}
