package ObjectClass;

public class Student {

	private String stdName;
	private int stdRollno;
	private int marks;
	private char gender;
	
	//default constructor
	public Student()
	{
		
	}
	//parameterized constructor
	public Student(String stdName, int stdRollno,int marks,char gender)
	{
		this.stdName=stdName;
		this.stdRollno=stdRollno;
		this.marks=marks;
		this.gender=gender;
	}
	//setters and getters
	public void setname(String stdName)
	{
		this.stdName=stdName;
	}
	public String getname()
	{
		return stdName;
	}
	public void setrollno(int stdRollno)
	{
		this.stdRollno=stdRollno;
	}
	public int getrollno()
	{
		return stdRollno;
	}
	public void setmarks(int marks)
	{
		this.marks=marks;
	}
	public int getmarks()
	{
		return marks;
	}
	public void setgender(char gender)
	{
		this.gender=gender;
	}
	public char getgender()
	{
		return gender;
	}
	//display method
	public void display()
	{
		System.out.println("Name of the Student : "+getname());
		System.out.println("rollno of the student : "+getrollno());
		System.out.println("marks of the student :"+getmarks());
		System.out.println("Gender of the student : "+getgender());
	}
	public static void main(String[] args) {
		
		Student s1 = new Student("Yamini",1,23,'F');
		String result1 = s1.toString();
		System.out.println("Complete information for student1 : "+result1);
		
		Student s2 = new Student("harini",1,37,'F');
		String result2 = s1.toString();
		System.out.println("Complete information for student1 : "+result2);

		
		Student s3 = new Student("raju",1,23,'m');
		String result3 = s1.toString();
		System.out.println("Complete information for student1 : "+result3);
		
		System.out.println("-----------------------------");
		s1.display();
		System.out.println("-----------------------------");
		s2.display();
		System.out.println("-----------------------------");
		s3.display();

	}

}
