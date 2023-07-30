package controler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first") // this is class maping we have 
// to use it before method mapping url ex = before /home
public class HomeController { // Sending data from controller to view using mode and modelandview object

	@RequestMapping(path = "/home", method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is Home url");
	  model.addAttribute("name", "Himanshu Kumar");
	  model.addAttribute("id", 123);
	  
	  List<String> friends = new ArrayList<String>();
	  friends.add("Raunak");
	  friends.add("Shashank");
	  friends.add("Roushan");
	  friends.add("Priyanshu");
	  
	 model.addAttribute("f", friends);
	  
	  		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.print("This is about Controller");
		return "about";
	}
	
	//services
	//help
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		 System.out.println(new Date());
		//creating modeland view
		ModelAndView modelandview = new ModelAndView();
	//	new Date();
		//setting the data
		modelandview.addObject("name","Himanshu Kumar");
		modelandview.addObject("id", 98040);
		modelandview.addObject("email", "himanshukr98040@gmail.com");
		  LocalDateTime now = LocalDateTime.now();
				  modelandview.addObject("time", now);
		List<Integer> list = new ArrayList<Integer>();
   list.add(3);
   list.add(23);
   list.add(34);
   list.add(48);
   list.add(87);
   list.add(90);
   list.add(100);
   
   modelandview.addObject("marks", list);
//setting the view page 
		modelandview.setViewName("help");
		return modelandview ;
	}
}
