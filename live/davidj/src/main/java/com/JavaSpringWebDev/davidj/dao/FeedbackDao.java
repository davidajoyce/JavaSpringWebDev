package com.JavaSpringWebDev.davidj.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.JavaSpringWebDev.davidj.entity.Feedback;

@Component
public class FeedbackDao 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Transactional
	public void addFeedback(Feedback feedback)
	{
		System.out.println("in addFeedback" + feedback);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(feedback);
	}

}
