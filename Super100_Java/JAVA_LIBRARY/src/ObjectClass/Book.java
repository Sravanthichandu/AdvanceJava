/* toString() after changing implementation*/

package ObjectClass;

public class Book {

	private String booktitle;
	private String bookAuthor;
	private int noOfPages;
	private int cost;
	
	public Book()
	{
		
	}
	
	public Book(String booktitle,String bookAuthor,int noOfPages,int cost)
	{
		this.booktitle=booktitle;
		this.bookAuthor=bookAuthor;
		this.noOfPages=noOfPages;
		this.cost=cost;
	}
	public void setbooktitle(String booktitle)
	{
		this.booktitle=booktitle;
	}
	public String getbooktitle()
	{
		return booktitle;
	}
	public void setbookAuthor(String bookAuthor)
	{
		this.bookAuthor=bookAuthor;
	}
	public String getbookAuthor()
	{
		return bookAuthor;
	}
	public void setnoofPages(int noOfPages)
	{
		this.noOfPages=noOfPages;
	}
	public int getnoOfPages()
	{
		return noOfPages;
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public int getcost()
	{
		return cost;
	}
	
	public void display()
	{
		System.out.println("BookTitle : "+getbooktitle());
		System.out.println("BookAuthor : " +getbookAuthor());
		System.out.println("BookPages  : " +getnoOfPages());
		System.out.println("BookCost : "+getcost());
	}
	
	@Override
	public String toString()
	{
		return getbooktitle() +" \n " + getcost();
	}
	
	public static void main(String[] args) {
		
		Book b1 = new Book("Java","Jamesgosling",900,1200);
		String res=b1.toString();
		System.out.println(res);


	}

}
