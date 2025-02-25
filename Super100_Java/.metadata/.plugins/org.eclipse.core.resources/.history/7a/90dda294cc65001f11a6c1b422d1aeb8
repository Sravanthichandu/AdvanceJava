package PracticeU;

   class Circle1 {

	public double radius;
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	public double perimeter()
	{
		return 2*Math.PI*radius*radius;
	}
	public double circumference()
	{
		return perimeter();
	}
  }
  class Cylinder extends Circle1
  {
	  public double height;
	  public double volume()
	  {
		  return area()*height;
	  }
	
  }
  public class Circle
  {
	public static void main(String[] args) {
		
		Cylinder c = new Cylinder();
		c.height=10;
		c.radius=5;
		System.out.println("Volume of Cylinder : "+c.volume());
		System.out.println("Area of Cylinder : "+c.area());
		System.out.println();
		Circle1 c1=new Circle1();
		c1.radius=5;
		System.out.println("Area of circle : "+c1.area());
		System.out.println("Circumference of circle : "+c1.circumference());
		System.out.println("Perimeter of circle : s"+c1.perimeter());
	}  
  }
