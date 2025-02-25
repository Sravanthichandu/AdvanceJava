package com.threads;
import java.lang.Thread;

class Threads
{
	private int threadNo;
	public Threads(int threadNo)
	{
		this.threadNo=threadNo;
	}
	public void countMe() throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			Thread.sleep(5000);
			System.out.println("ThreadNo : "+threadNo+" iteration no : "+i);
		}
	}
}
public class Exampl1 {

	public static void main(String[] args)throws InterruptedException
	{
		Threads t1 = new Threads(1);
		Threads t2 = new Threads(2);
		t1.countMe();
		System.out.println();
		t2.countMe();
	}
}
