package MethodOverriding;

public class Mainclass {

	public static void main(String[] args) {
		
		Developer d = new Developer();
	    d.login();
		d.work();
		d.logout();
		d.sal();
		System.out.println("-----------------");
		Tester t = new Tester();
		t.login();
		t.work();
		t.logout();
		t.sal();
	}
}
