package String;

public class SplitMethod {

	public static void main(String[] args) {
	
		String s = "java jsp";
		String ch[] = s.split("a");
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
	}

}
