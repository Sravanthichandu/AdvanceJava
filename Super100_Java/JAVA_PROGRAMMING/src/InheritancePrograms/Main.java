package InheritancePrograms;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Son's properties : ");
		Son s = new Son();
		s.amount();
		s.gold();
		s.Land();
		s.work();
		System.out.println();
		System.out.println("Daugther properties : ");
		Daugther d = new Daugther();
		d.amount();
		d.gold();
		d.Land();
		d.work();
	}

}
