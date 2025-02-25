package servlet_dynamic_maven2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import servlet_dynamic_maven2.model.Demo;

@Controller
public class DemoController {

	//sending request
	@RequestMapping("/first")
	public ModelAndView first()
	{
		System.out.println("First Request Handled");
		return null;
	}
	
	//sending request and getting response
	@RequestMapping("/second")
	public ModelAndView second()
	{
		System.out.println("Second Request Handled");
		ModelAndView view = new ModelAndView("print.jsp");
		return view;
	}
	
	//sending data as a request
	@RequestMapping("/third")
	public ModelAndView third(@RequestParam("email") String email)
	{
		System.out.println(email);
		ModelAndView view = new ModelAndView("print.jsp");
		return view;
	}
	//output : http://localhost:8080/servlet_dynamic_maven2/third?email=dinga@gmail.com
	
	//
	@RequestMapping("/fourth")
	public ModelAndView fourth(@RequestParam("email") String email,@RequestParam("Pwd") String Pwd)
	{
		ModelAndView view = new ModelAndView("print.jsp");
		view.addObject("msg","loginSuccess");
		return view;
	}
	//output:http://localhost:8080/servlet_dynamic_maven2/fourth?email=dinga1@gmail.com&Pwd=123
	
	@RequestMapping("/fifth")
	public ModelAndView fifth(@ModelAttribute Demo demo)
	{
		System.out.println(demo);
		ModelAndView view = new ModelAndView("print.jsp");
		view.addObject("msg","loginSuccess");
		return view;
	}
}
