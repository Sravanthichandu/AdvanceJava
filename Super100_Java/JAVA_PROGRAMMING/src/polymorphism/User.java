package polymorphism;

public class User extends ShoppingCart
{
	public static void main(String[] args) {
	
		ShoppingCart s1 = new ShoppingCart("Laptop",2, 1200);
		ShoppingCart.printWelcomeMessage();
		s1.CalculateTotal(10);
		s1.display();
	}

}
