package com;

public class Books {

	private String bookName;
	private String Author;
	private int cost;
	private int bookId;
	
	public Books()
	{
		
	}

	public Books(String bookName, String author, int cost, int bookId) {
		
		this.bookName = bookName;
		Author = author;
		this.cost = cost;
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public void Display()
	{
		System.out.println("BookName : "+getBookName());
		System.out.println("BookId   : "+getBookId());
		System.out.println("BookCost : "+getCost());
		System.out.println("BookAuthor :"+getAuthor());
	}
	
	public String toString()
	{
		return "BookName : "+getBookName()+"\n"+"BookId : "+getBookId()
				+"\n"+"BookCost : "+getCost() + "\n" + "BookAuthor : "+getAuthor();
	}
	
	
	
}
