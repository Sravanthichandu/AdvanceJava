package ObjectClass;

public class BagMainClass {

	public static void main(String[] args) {
		Bag b1 = new Bag("SkyBag",500,4,"Leather");
		
		Bag b2 = new Bag("ApsaraBag",900,2,"Cloth");
		Bag b3 = new Bag("CelloBag",1100,2,"Leather");
		Bag b4 = new Bag("RoyalBag",800,1,"Plastic");
		System.out.println("toString method : ");
		System.out.println(b2);
		String res1=b2.toString();
		System.out.println(res1);
		String res2=b4.toString();
		System.out.println(res2);
		boolean compare=b1.equals(b3);
		System.out.println(compare);
		System.out.println("Hashcode method : Before Overriding");
		System.out.println("Hashcode method create uid(unique identification number) for object Address");
		int hash = b2.hashCode();
		System.out.println(hash);
		int hash1=b2.hashCode();
		System.out.println(hash1);
	
		

	}

}
