package mum.edu.cs544.extraCredit.business;

import java.util.Date;

import javax.persistence.Entity;

@Entity

public class Director extends Artist 
{
	String roles;
	
	public Director(String title, Date birthdate, String birthPlace, String summery, String roles) {
		super(title, birthdate, birthPlace, summery);
		
		this.roles = roles;
		
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

}
