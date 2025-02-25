package constructors;

public class Employee_Driver {

	public static void main(String[] args) {
		System.out.println("Employee details");
		System.out.println("---------------------------");
		Employee employee1 = new Employee("kaliyan" , 15 ,60000);
		employee1.display();
		Employee employee2 = new Employee("Tom" , 15 ,60000);
		employee2.display();
		Employee employee3 = new Employee("shyam" , 16 ,60000);
		employee3.display();

	}

}
