package s22.Harjoitus1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Harjoitus1Controller {
	
	@RequestMapping("index")
	@ResponseBody
	public String welcomeIndex() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String welcomeContect() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String sayHello(@RequestParam(name="location") String location2,
			@RequestParam(name="name") String name2) {
		return "Welcome to the " + location2 + " " + name2 + "!";
	}

}
