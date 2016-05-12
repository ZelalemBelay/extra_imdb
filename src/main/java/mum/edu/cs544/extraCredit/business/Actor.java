package mum.edu.cs544.extraCredit.business;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Actor extends Artist{

	public String characterOnMovie;
	
	public Actor(String title, Date birthdate, String birthPlace, String summery, String characterOnMov) {
		super(title, birthdate, birthPlace, summery);
		
		this.characterOnMovie = characterOnMov;
	}

	public String getCharacterOnMovie() {
		return characterOnMovie;
	}

	public void setCharacterOnMovie(String characterOnMovie) {
		this.characterOnMovie = characterOnMovie;
	}

	
	
}
