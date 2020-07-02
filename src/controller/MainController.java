package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "redirect:/form";
	}
	
	@GetMapping("/form")
	public String Sample() {
		return "form";
	}
	@RequestMapping(value="/jusoPopup" , method = {RequestMethod.GET, RequestMethod.POST})
	public String jusoPopup() {
		return "jusoPopup";
	}
	
	
}
