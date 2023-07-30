package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int userId, @PathVariable("userName") String userName){
		
		System.out.println(userId);
		System.out.println(userName);
		return "home";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		
		System.out.println("This is console code");
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String queryseach, Model model)
	{
	
	String url = "https://www.google.com/search?q="  +  queryseach;
	RedirectView redirect  = new RedirectView();
	
	if(queryseach == null || queryseach.isBlank()) {
	
		/*
		 * model.addAttribute("msg", "SearchBox is Empty"); model.addAttribute("msg1",
		 * "Please search somthing");
		 */
		
		redirect.setUrl("home");
	}
	else {
		redirect.setUrl(url);
	}
//	redirect.setUrl(url);
	
		return redirect;
	}
	

}
