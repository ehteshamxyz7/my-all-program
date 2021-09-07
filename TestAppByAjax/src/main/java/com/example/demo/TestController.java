package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {

	
	    @RequestMapping("/home")
	    public String home() {
	        return "home";
	    }
	    
	    @PostMapping("/save")
	    @ResponseBody
	    public String saveRequest(@RequestParam("userN") String userN,@RequestParam("userP") String userP) {
			
	    	System.out.println(userN +" "+ userP);
	    	if(userP==null) {
	    		
	    		return "error";
	    	}
	    	
	    	return "sucess";
	    	
	    	
	    }
	}
