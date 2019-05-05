package com.JavaSpringWebDev.davidj.dao;

import org.springframework.stereotype.Component;

import com.JavaSpringWebDev.davidj.entity.Feedback;

@Component
public class FeedbackDao 
{
	public void addFeedback(Feedback fb)
	{
		System.out.println("in addFeedback" + fb);
	}

}
