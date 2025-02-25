package com.BookProgram;

import java.util.Random;

public class Book {

	int bookId;
	String booktitle;
	int bookCost;
	int noOfPages;
	String bookAuthor;
   
	public boolean validateBookTitle(String booktitle) {
		if(booktitle.length()>=7)
		{
		  if((booktitle.equals('A')&&booktitle.equals('Z'))||(booktitle.equals('a')&&booktitle.equals('z'))||
				  booktitle.equals('0')&&booktitle.equals('9')||booktitle.equals('_'))
		  {
			  this.booktitle=booktitle;
			 
		  }
		  return true;
		}
	    else
		{
	    	System.out.println("Data Mismatch Message ");
	        return false;
		}
		
	}
	public boolean validateBookCost(int bookCost)
	{
		if(bookCost>=200 && bookCost<=1000)
		{
			this.bookCost=bookCost;
			return true;
		}
		else
		{
			System.out.println("Data Mismatch Message ");
			return false;
		}
	}
	public boolean validateNoOfPages(int noOfPages)
	{
		if(noOfPages>=100 && noOfPages<=400)
		{
			this.noOfPages=noOfPages;
			return true;
		}
		else
		{
			System.out.println("Data Mismatch Message ");
			return false;
		}
	}
	public boolean validatebookAuthor(String  bookAuthor)
	{
		
		return false;
	}
	//constructor
	public Book(String booktitle,int bookCost,int noOfPages,String bookAuthor)
	{
		this.booktitle=booktitle;
		this.bookCost=bookCost;
		this.noOfPages=noOfPages;
		this.bookAuthor=bookAuthor;
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}
	//Helper methods to modify
	public void Updatebooktitle(String booktitle)
	{
		this.booktitle=booktitle;
	}
	public void UpdatebookCost(int bookCost)
	{
		this.bookCost=bookCost;	
	}
	public void UpdatenoOfPages(int noOfPages)
	{
		this.noOfPages=noOfPages;
	}
	public void UpdatebookAuthor(String bookAuthor)
	{
		this.bookAuthor=bookAuthor;
	}
	//separate helper methods to return
	public String getBooktitle()
	{
		return booktitle;
	}
	public int getBookCost()
	{
		return bookCost;
	}
	public int getnoOfPages()
	{
		return noOfPages;
	}
	public String getBookAuthor()
	{
		return bookAuthor;
	}
	

	public static void main(String[] args) {
		Random r = new Random();
		int bookId=r.nextInt(999);
		Book b = new Book();
		System.out.println("BookId      : "+bookId);
		/*System.out.println("BookTitle   : "+b.validateBookTitle("poorChild"));
		System.out.println("BookCost    : "+b.validateBookCost(300));
		System.out.println("No.Of.Pages : "+b.validateNoOfPages(300));*/
		

	}
	
}
