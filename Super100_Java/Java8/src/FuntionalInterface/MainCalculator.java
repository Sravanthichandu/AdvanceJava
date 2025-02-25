package FuntionalInterface;

public class MainCalculator {

	public static void main(String[] args) {
		
		Calculator c = (int a,int b)->
		{
			int d = a+b;
			System.out.println(d);
		};
		c.calci(50, 40);
		c = (int a ,int b)->
		{
			int d = a-b;
			System.out.println(d);
		};
		c.calci(30, 30);
		c=(int a ,int b)->
		{
			int d = a*b;
			System.out.println(d);
		};
		c.calci(1, 20);
		c=(int a ,int b)->
		{
			int d = a/b;
			System.out.println(d);
		};

		c.calci(50, 2);
		
	}
}
