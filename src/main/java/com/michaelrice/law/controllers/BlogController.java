package com.michaelrice.law.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.michaelrice.law.domain.BlogEntry;
import com.michaelrice.law.domain.BlogServiceDao;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/admin/blog/*")
public class BlogController {
	
	@Autowired
	private BlogServiceDao blogServiceDao;
	
	@RequestMapping(value="new", method=GET)
	public String newEntry(Model model) {
		
		BlogEntry entry=new BlogEntry();
		entry.setId(-1);
		model.addAttribute("entry", entry);
		
		return "/admin/blog/new";
	}

	@RequestMapping(value="new", method=POST) 
	public String saveNewEntry(@RequestParam("title") String title, @RequestParam("urlPart") String urlPart,
			@RequestParam("body") String body, Model model) {

		BlogEntry entry=new BlogEntry();
		entry.setTitle(title);
		entry.setUrlPart(urlPart);
		entry.setBody(body);
		
		blogServiceDao.save(entry); 
		
		model.addAttribute("entry", entry);
		
		return "/admin/blog/new";
	}
}
