package com.michaelrice.law.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Home controller generates the home page for Michael Rice Law.
 * 
 * @author mrice
 * 
 */
@Controller
public class HomeController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Model model) {
		
		model.addAttribute("currentTime", new Date());
		
		return "home";
	}
}
