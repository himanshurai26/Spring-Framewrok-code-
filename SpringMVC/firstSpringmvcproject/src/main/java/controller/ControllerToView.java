package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerToView { // sending data from controller to view 
	//using Model object
	@RequestMapping(path="/home", method = {RequestMethod.GET, RequestMethod.POST})
	public String Display(Model model) {
		
		System.out.println("This is Method I am sending data from controller to view");
	model.addAttribute("name", "Himanshu Rai");
	model.addAttribute("roll", 23);
	model.addAttribute("class", "12th");
	model.addAttribute("city", "Bettiah");
	
    List<String> list = new ArrayList<String>();
	list.add("Suman Saurav");
	list.add("Ujjwal Kumar");
	list.add("Shashank Dangi");
	list.add("Utkarsh Kumar");
	list.add("Rupesh Kumar");
	list.add("Bhupendra Tiwari");
	
	model.addAttribute("friend", list);
		return "home";
	}
	
	@RequestMapping("/modelandview")
public ModelAndView Print() {
	System.out.println("this is Model and view Page");
	ModelAndView modelandview = new ModelAndView();
	
	modelandview.addObject("name", "Raja Kumar");
	modelandview.addObject("id", 43);
	modelandview.addObject("email", "himanshukr98040@gmail.com");
	modelandview.addObject("degree", "B.Voc Software Development (IT/ITES)");
	
	modelandview.setViewName("modelandview");
	
	return modelandview;
	
	
}

}
