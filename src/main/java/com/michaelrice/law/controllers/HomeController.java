package com.michaelrice.law.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import com.michaelrice.law.domain.BlogEntry;
import com.michaelrice.law.domain.BlogServiceDao;

/**
 * Home controller generates the home pages for Michael Rice Law.
 * 
 * @author mrice
 * 
 */
@Controller
public class HomeController {
	
	@Autowired
	private BlogServiceDao blogServiceDao;
	
	
	@RequestMapping(value="/", method=GET)
	public String home(Model model) {

		List<BlogEntry> entries = blogServiceDao.listLastN(5);
		
		model.addAttribute("entries", entries);
		model.addAttribute("currentTime", new Date());
		
		return "home";
	}
	
	@RequestMapping(value="/law", method=GET)
	public String lawHome(Model model) {

		model.addAttribute("currentTime", new Date());
		
		return "law/home";
	}
}
