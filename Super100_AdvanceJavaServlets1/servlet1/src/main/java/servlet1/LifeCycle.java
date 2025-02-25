package servlet1;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycle extends GenericServlet
{


	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Phase 1");
		
	}
	
	/*
	static  // static is a block -- 
	{
		System.out.println("Class Loading Phase");
	}
	@Override
    public void init() throws ServletException
    {
    	System.out.println("init Phase");
    }
	
	@Override
	public void destroy()
	{
	    System.out.println("Destroy phase");	
	}
	
	public LifeCycle()
	{
		System.out.println("instantation phase");
	}
	*/

}
/*
 * we can write anywhere the methods are called in order
 * */
