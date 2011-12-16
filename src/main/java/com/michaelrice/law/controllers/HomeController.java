package com.michaelrice.law.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Home controller generates the home page for Michael Rice Law.
 * 
 * @author mrice
 * 
 */
@Controller
public class HomeController {
	@RequestMapping(value="/law",method=RequestMethod.GET)
	public ModelAndView home() {
		
		ModelAndView modelAndView=new ModelAndView("home");

		modelAndView.addObject("currentTime", new Date());
		
		return modelAndView;
	}
}
