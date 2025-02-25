package interfacePrograms;

public class Test  implements Demo{

	@Override
	public void login() {
		
		System.out.println("Login at 8 clk");
		
	}

	@Override
	public void logout() {
		System.out.println("Logout at 9 clk");
		
	}
	
    public static void main(String[] args) {
		
    	Demo d = new Test();
    	d.login();
    	d.logout();

	}


}
