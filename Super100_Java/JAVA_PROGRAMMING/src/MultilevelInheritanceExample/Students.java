package MultilevelInheritanceExample;

public class Students
{

	public static void main(String[] args) {
	
		Branch b = new Branch();
		
		System.out.println("University Name : " +b.uniName);
		System.out.println("CollegeName     : " +b.collegeName);
		System.out.println("BranchName      : " +b.branchName);
		System.out.println("rank for university : "+b.rank);
		b.Fee();
		b.exams();
		


	}

}
