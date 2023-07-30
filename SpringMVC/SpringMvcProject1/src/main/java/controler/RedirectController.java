package controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	/* this is first way to redirect page
	 * @RequestMapping("/one") 
	 *  public String one() {
	 * System.out.println("This is one handler");
	 *  return "redirect:/enjoy"; }
	 */
	
	// this is second way to redirect the page
	
	@RequestMapping("/one")
	public RedirectView one()
	{
	    System.out.println("This is one handler");
	    
	  RedirectView redirectView = new RedirectView();
		
		 redirectView.setUrl("enjoy");
		//  redirectView.setUrl("https://www.google.com");
		return  redirectView;
	}
	
	@RequestMapping("/enjoy")
	public String two()
	{
		
		System.out.println("this is second handler");
		return "contact";
	}
}
