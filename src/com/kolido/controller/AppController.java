package com.kolido.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String homePage(ModelMap model){
		model.addAttribute("message", "im still leaning Spring MVC");
		return "index";
	}
	
	
	@RequestMapping(value = "/aboutMe", method = RequestMethod.GET)
	public String aboutMe(ModelMap model){
		model.addAttribute("show", "im yuh, im 23 year old");
		return "about";
	}
}
