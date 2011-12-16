package com.michaelrice.law.domain;

import java.util.List;

import org.hibernate.SessionFactory;

public class HibernateBlogServiceDao implements BlogServiceDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	@Override
	public List<BlogEntry> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BlogEntry> listLastN(int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlogEntry query(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
