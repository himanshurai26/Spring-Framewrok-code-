package springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;




public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "index";
	}
}
