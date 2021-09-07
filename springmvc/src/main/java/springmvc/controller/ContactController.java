package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;


	@RequestMapping("/form1")
	public String showForm() {
		
		return "contact";

	}

	@PostMapping("/processform")
	public String handleForm(@ModelAttribute User user) {
		System.out.println(user);
		this.userService.createUser(user);

		return "success";

	}

}

/*
 * @RequestMapping(path = "/processform",method = RequestMethod.POST) public
 * String handleForm(
 * 
 * @RequestParam("Email_address") String userEmail,
 * 
 * @RequestParam("userName") String userName,
 * 
 * @RequestParam("pass") String userPassword,Model model) {
 * System.out.println("userEmail "+ userEmail); System.out.println("userName "+
 * userName); System.out.println("userPassword"+ userPassword);
 * 
 * model.addAttribute("email", userEmail); model.addAttribute("name",userName);
 * model.addAttribute("password",userPassword);
 * 
 * 
 * return "success";
 */