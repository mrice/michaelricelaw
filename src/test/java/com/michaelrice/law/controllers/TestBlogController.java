package com.michaelrice.law.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:mrl-service.xml"})
public class TestBlogController {
	
	@Test
	public void testNewPage() {
		BlogController controller=new BlogController();
		
		//TODO figure out how to get the Model object
	}
}
