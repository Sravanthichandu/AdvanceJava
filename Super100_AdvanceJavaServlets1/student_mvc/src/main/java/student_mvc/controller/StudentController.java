package student_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import student_mvc.dao.StudentDao;
import student_mvc.dto.Student;

@Controller
public class StudentController
{
	@Autowired
	StudentDao dao;
	
	@RequestMapping("/save")
	public ModelAndView register(@ModelAttribute Student student)
	{
		ModelAndView view = new ModelAndView();
		try {
			dao.save(student);
			view.setViewName("Login.jsp");
			return view;
		}
		catch(Exception e)
		{
			view.setViewName("Register.jsp");
			view.addObject("msg","your data is not saved "+ e.getMessage());
			return view;		
		}
		
	}
	@RequestMapping("/Login")
	public ModelAndView login(@ModelAttribute Student student)
	{
		ModelAndView view = new ModelAndView();
	    dao.login(student);
	    view.setViewName("Register.jsp");
		return view;
		
		
	}

}
