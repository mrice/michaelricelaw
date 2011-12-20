package com.michaelrice.law.domain;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

public class HibernateBlogServiceDao implements BlogServiceDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	
	/**
	 * Can be used by the JUnit test runners to make sure the database configuration works
	 * @return
	 */
	@Transactional
	protected boolean verifyConnectivity() {
		boolean result = false;
		Session session = sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		result = session.isConnected();
		session.getTransaction().commit();
		
		return result;
		
	}
	
	@Transactional
	@Override
	public void save(BlogEntry entry) {
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		session.saveOrUpdate(entry);
		session.getTransaction().commit();
		
	}

	@Transactional
	@Override
	@SuppressWarnings("unchecked")
	public List<BlogEntry> listAll() {
		
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		List<BlogEntry> result=session.createQuery("from BlogEntry").list();
		session.getTransaction().commit();
		
		return result;
	}

	@Override
	public List<BlogEntry> listLastN(int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlogEntry queryById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	@Override
	public BlogEntry queryByUrlPart(String urlPart) {
		BlogEntry result=null;
		
		Session session=sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			
			String hql = "from BlogEntry where urlPart=?";
			Query query = session.createQuery(hql);
			query.setString(0, urlPart);
			result = (BlogEntry)query.uniqueResult();
			session.getTransaction().commit();
			
		} catch (Exception e) {
			//TODO log this
			e.printStackTrace();
		}
		return result;
	}

}
