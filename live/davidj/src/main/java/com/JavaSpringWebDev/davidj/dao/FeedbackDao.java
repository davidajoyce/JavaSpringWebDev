package com.JavaSpringWebDev.davidj.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.JavaSpringWebDev.davidj.entity.Feedback;

@Component
public class FeedbackDao 
{
	
	private SessionFactory sessionFactory;
	
	public void addFeedback(Feedback feedback)
	{
		System.out.println("in addFeedback" + feedback);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(feedback)
	}

}
