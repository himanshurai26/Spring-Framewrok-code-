package controler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.User;
import springmvc.Service.UserService;


@Controller
public class ContactController { // sending data from view to controller class
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		
		  m.addAttribute("Header", "This is Registration Page");
		 m.addAttribute("desc", "Home Page ");
		 System.out.print("Adding common data to model");

	}
	@RequestMapping("/contact")
	public String showForm(Model m) // this is handler class
	{
		/*
		 * m.addAttribute("Header", "This is Registration Page"); m.addAttribute("desc",
		 * "Home Page ");
		 */
		
		System.out.print("Creating form");
		   return "contact";
		 
	}
	
	
	//now using model attribute
	@RequestMapping(path="processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		
		
		System.out.print(user);
		
		if(user.getUsername().isBlank()) {
			return "redirect://contact";
		}
		
		int createdUser = this.userService.createUser(user);
	
		
		 model.addAttribute("msg", "User Created Successfully...");
		model.addAttribute("msg1", "User created with id  " + createdUser);
		model.addAttribute("db", "Detailes  successfully inserted to database...");
		
		/* if the data is same for the many method then we have ti create a common method and usin @modelAttrbute annotion we
		 *we can access from any wheer
		 * model.addAttribute("Header", "This is Registration Page");
		 * model.addAttribute("desc", "Home Page ");
		 */
		
		return "success";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/*  this is the done by using httpServlet and reqestParaM
	 * @RequestMapping(path ="/processform", method=RequestMethod.POST) 
	 * public String handleForm(Servlet method HttpServletRequest request ) { //
	 * this is servlet method
	 * 
	 * String email = request.getParameter("email"); String username =
	 * request.getParameter("username"); String userpassword =
	 * request.getParameter("userpassword");
	 * 
	 * System.out.println("userEmail is = " + email);
	 * System.out.println("UserName is = " + username);
	 * System.out.println("UserPassword is = " + userpassword);
	 * 
	 * 
	 * 
	 * return ""; }
	 */
	

	/*
	 * @RequestMapping(path="/processform", method=RequestMethod.POST) public String
	 * handleForm(@RequestParam("email") String userEmail, @RequestParam("username")
	 * String userName, @RequestParam("userpassword") String userPassword, Model
	 * model) {
	 * 
	 * 
	 * 
	 * System.out.println("userEmail is = " + userEmail);
	 * System.out.println("userName = " + userName);
	 * System.out.println("userPassword = " + userPassword);
	 * 
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setUsername(userName);
	 * user.setUserpassword(userPassword);
	 * 
	 * System.out.println(user + " ");
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * 
	 * 
	 * User user = new User(); user.setEmail(userName); user.setUserName(userName);
	 * user.setUserPassword(userPassword);
	 * 
	 * System.out.println(user);
	 * 
	 * 
	 * 
	 * 
	 * model.addAttribute("email", userEmail); model.addAttribute("name", userName);
	 * model.addAttribute("password",userPassword);
	 * 
	 * 
	 * // now we can use model attribute annotation for this code to make it simple
	 * and shorter code // by creating entites user name clasas and then create
	 * object and pass the value model.addAttribute("user", user);
	 * 
	 * return "success"; }
	 */
}