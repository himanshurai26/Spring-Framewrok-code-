package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvcsearch.enties.Student;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String form()
	{
		System.out.println("this is complex form....");
		return "complex-form";
	}
	
	@RequestMapping(path="/handleform", method=RequestMethod.POST)
	public String formhandler(@ModelAttribute("student") Student student, BindingResult result)
	{
		
		if(result.hasErrors()) {
			
			return "complex-form";
		}
		System.out.println(student);
		System.out.println(student.getAddress());
		
	
		return "success";
		
	}
}
