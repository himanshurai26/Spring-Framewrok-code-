package controller;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.User;

@Controller
public class ViewToController {
	
	@ModelAttribute
	public void commonProperty(Model m) {
		
		m.addAttribute("head", "Registration Page");
		m.addAttribute("footer", "All Credit goes to Himanshu Kumar");
		System.out.println("This is common property.");
	}
	

	@RequestMapping("/form")
	public String contact(Model m) {
		System.out.println("This is contact form page");

		return "form";
	}
	
	
	@RequestMapping(path="/formprocess", method=RequestMethod.POST)
	public String formHandler(@ModelAttribute User user, Model model) {
		
		System.out.println(user);
		return "success";
		
	}
	
	
	
	
	
	
	
	
	
	
	

	/*
	 * @RequestMapping(path="/formprocess", method=RequestMethod.POST) public String
	 * handleForm(@RequestParam("name") String name, @RequestParam("email") String
	 * email, @RequestParam("phone") String phone, @RequestParam("password") String
	 * password, Model model) {
	 * 
	 * System.out.println(name);
	 *  System.out.println(email);
	 * System.out.println(phone);
	 *  System.out.println(password);
	 * 
	 * User user = new User(); 
	 * user.setName(name); 
	 * user.setEmail(email);
	 * user.setPhone(phone);
	 *  user.setPassword(password);
	 * 
	 * System.out.println(user);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * 
	 * 
	 * model.addAttribute("name", name); model.addAttribute("email",email);
	 * model.addAttribute("phone", phone); model.addAttribute("password", password);
	 * 
	 * 
	 * return "success";
	 * 
	 * }
	 */

	/*
	 * this is using HttpServletReqtest
	 * 
	 * @RequestMapping(path="/formprocess", method=RequestMethod.POST) public String
	 * handleForm( HttpServletRequest request, Model model) {
	 * 
	 * String name = request.getParameter("name");
	 *  String email =
	 * request.getParameter("email"); 
	 * String phone = request.getParameter("phone");
	 * String password = request.getParameter("password");
	 * 
	 * System.out.println(name);
	 *  System.out.println(email);
	 * System.out.println(phone); 
	 * System.out.println(password);
	 * 
	 * model.addAttribute("name", name); 
	 * model.addAttribute("email", email);
	 * model.addAttribute("phone", phone); 
	 * model.addAttribute("password", password);
	 * 
	 * return "success"; }
	 */

}
