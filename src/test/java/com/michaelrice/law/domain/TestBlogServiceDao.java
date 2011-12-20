package com.michaelrice.law.domain;

import static junit.framework.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:mrl-service.xml"})
public class TestBlogServiceDao {
	
	@Autowired 
	private BlogServiceDao blogServiceDao;
	
	@Test
	public void testConnection() {
		boolean connected=((HibernateBlogServiceDao)blogServiceDao).verifyConnectivity();
		assertTrue("Database should be connected", connected);
	}
	
	@Test
	public void testSaveNewBlogEntry() {
		BlogEntry entry=new BlogEntry();
		entry.setTitle("Hello, world");
		
		blogServiceDao.save(entry);
		
		assertNotNull("Identifier should not be null", entry.getId());
		
	}

	@Test
	public void testListAll() {
		
		List<BlogEntry> entries=blogServiceDao.listAll();
		assertNotNull("Entries should not be null", entries);
		assertTrue("Entries should have more than one entry", entries.size()>0);
		
	}
	
	@Test
	public void testQueryByUrlPart() {
		
		BlogEntry one=new BlogEntry();
		one.setUrlPart("this_is_a_url_part");
		blogServiceDao.save(one);
		
		assertNotNull("Should have saved the first one", one.getId());
		
		BlogEntry two=blogServiceDao.queryByUrlPart(one.getUrlPart());
		
		assertNotNull("Should have retrieved the second one", two);
		
	}
	
}
