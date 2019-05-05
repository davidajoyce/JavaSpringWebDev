package com.JavaSpringWebDev.davidj.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Component
@Scope("prototype")*/
@Entity
public class Feedback 
{
	private String name;
	// this will make it a primary key
	@Id
	private String email;
	private String regarding;
	private String code;
	private int rating;
	
	public Feedback() {}

	
	public Feedback(String name, String email, String reg, String code, int rating) {
		super();
		this.name = name;
		this.email = email;
		this.regarding = reg;
		this.code = code;
		this.rating = rating;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReg() {
		return regarding;
	}
	public void setReg(String reg) {
		this.regarding = reg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Feedback [name=" + name + ", email=" + email + ", reg=" + regarding+ ", code=" + code + ", rating=" + rating
				+ "]";
	}
	

}
