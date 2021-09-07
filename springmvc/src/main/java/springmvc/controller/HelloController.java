package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home page");
		model.addAttribute("name", "Ehtesham Alam");
		model.addAttribute("id",12345);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Asad"); 
		friends.add("arshad");
		friends.add("aamir");
		friends.add("sakib");
		model.addAttribute("f",friends);
		return "home";

	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//set data
		modelAndView.addObject("name","Ehtesham Alam");
		modelAndView.addObject("rollNumber",12345);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(123);
		list.add(1234);
		list.add(12345);
		list.add(123456);
		modelAndView.addObject("marks",list);
		
		//setting the viewName
		modelAndView.setViewName("help");
		
		return modelAndView;
		
	}

	@RequestMapping("/first")
	public String first() {
		System.out.println("created");

		return "first";

	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about homeController");

		return "about";

	}

}
