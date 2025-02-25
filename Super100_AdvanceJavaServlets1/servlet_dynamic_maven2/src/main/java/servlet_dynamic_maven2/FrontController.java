package servlet_dynamic_maven2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {servlet_dynamic_maven2Config.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

	
	
}

/*it is main gateway
 * execution start from gateway
 * main gateway start from frontcontroller(component --class,interface)
 * othername- dispatcher controller
 * it is responsible to config database or webpage
 * whatever configuration required it will config
 * how can we convert java frontcontroller class into front controller -- by inherting
 * by using inbuild class
 * --ABstractAnnotationConfigDispatcherServletInitializer inherit
 * and override methods(3 methods overide)
 * 1.getRootConfigClasses()
 * --- to create container --by using beanfactory or applicationcontextcontainer
 * ----configuration --xml or annotation (by creating configuration file)
 * based project give configuration file names
 * 
 * 2.getServletConfigClasses() 
 *------- is responsible to bind particular request java class
 *it returns -- return new Class[] { servlet_dynamic_maven2Config.class};
 *
 *
 * 3. getServletMappings() map or  bind  particular request with particular resource
 * return type string array
 * slash(/)  returing in the form of  return new String[] {"/"};
 * -----------------------------------------------------------------------------
 * -----------------------------------------------------------------------------
 * javax.servlet.ServletException cannot be resolved. -- error under package 
 * becuase inherting class does not handle servlets so add dependency
 * add servlet dependency
 * servlet api -- 3.1.0 version (highly usage version)
 * ----------------------------------------------------------------------------------
 * --------------------------------------------------------------------------------
 * @Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] { servlet_dynamic_maven2Config.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
if there any mistake it wont bind 
 * ---------------------------------------------------------------------------------------------
 * -----------------------------------------------------------------------------------------------
 * in servlet mapping with- class  -- @WebServlet("/)
 * in springwebmvc mapping with methods ----@RequestMapping("/")
 * ------------------------------------------------------------------------
 * --------------------------------------------------------------------------
 * in servlet moving from one page to another page --- requestDispatcher
 * in springwebmvc we can di it by model and view  it is a class
 * by creating object for model and view and passing the page like eg(print.jsp) it should be given in 
 * string quotes
 * eg : 
 * 
 * MVC DESIGN PATTERN OR ARCHITECTURE
 * request--- frontcontroller---config file ---container create(j2ee) and objects at frontcontroller
 * @controller -- on class that are controller objects
 * it only search for controller objects it go with help of handlerMapping
 * on controller it creates modelandview objects are created
 * and the modelandview it come back to frontcontroller
 * and go to view --with help of @RequestMapping
 * with help view Resolver it comes to particular view by carrying (modelandview objects)
 * in view we can develop jsp pages 
 *  it is developed with different technologies (jsp,apachemavtery)with help html wont work
 * 
 * and from view it come back to front controller and give response in browser
 * ----------------------------------------------------------
 * ------------------------------------------------------------
 * servlet -- setAttribute (to add information)
 * In springwebMVC -- to add information use objectreference(view).addObject("msg","loginsuccess");
 * to get that msg use request.getAttribute -- it return object type data
 * we are printing string type so downcast it .
 * 
 * 
 * --------------------------------------------------------------------
 * -----------------------------------------------------------------------
 * package.model
 * model is a encapsulated class it can be called as dto class
 * so to avoid getters and  setters(boilerplate code)
 * add dependency lombok 
 * 
 * 
 * ----------------------------------------------------------------
 * -----------------------------------------------------------------
 * @modelAttribute --- to hold the objects (more than one like string email ,string password)then we use @RequestParam
 * */
/*spring mvc architecture or workflow
 * -------------------------------------------------------------------------
 * model and view ---> view pages,model objects
 * what is model ? poj
 * model link with database
 * 1.browser-->front controller --> controller --> model ---> contoller --> frontcontroller ---> view --> to again frontcontroller --> browser
 * from  controller to view --> view to controller --> front controller--> browser
 * ---------------------------------------------------------------------------------
 * --------------------------------------------------------------------------------------
 * from controller go to the model ( model --it can be service layer,dao,dtolayer)
 * 
 * controller-->dao--> persist()-- save DB -- and response get back to browser
 * 
 * model---> database operation and from model to go back to the controller ---> to frontcontroller---> get response to browser
 * 
 * 
 * 
 * */
