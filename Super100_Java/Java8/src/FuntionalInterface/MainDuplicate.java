package FuntionalInterface;

public class MainDuplicate {

	public static void main(String[] args) {
		
		 DuplicatesElements d = (String s)->
		 {
			 String s1="";
			 for(int i=0;i<s.length();i++)
			 {
				 char ch = s.charAt(i);
				 if(s1.indexOf(ch)==-1)
				 {
					s1 = s1+ch;
				 }
				 
			 }
			 return s1;
			 
		 };
		 System.out.println( d.duplicate("Java"));
	}
}
