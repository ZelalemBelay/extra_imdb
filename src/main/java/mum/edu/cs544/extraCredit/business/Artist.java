package mum.edu.cs544.extraCredit.business;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Artist {
	
	@Id @GeneratedValue
	private int id;
	
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Past
	private Date birthdate;
	
	private String birthPlace;
	
	@Column
	private String summary;
	
	@Lob
	private byte[] ArtistImage;

	@ManyToMany(mappedBy = "artists")
	private List<Movie> movies = new ArrayList<>();

	
	public Artist(String title, Date birthdate, String birthPlace,
			String summery) {
		super();
		this.name = title;
		this.birthdate = birthdate;
		this.birthPlace = birthPlace;
		this.summary = summery;
	}
	
	public Artist() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public String getName() {
		return name;
	}

	public void setLastName(String Name) {
		this.name = Name;
	}
	


	public String getPlaceOfBirth() {
		return birthPlace;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.birthPlace = placeOfBirth;
	}

	public String getBiography() {
		return summary;
	}

	public void setBiography(String s) {
		this.summary = s;
	}

	public byte[] getImage() {
		return ArtistImage;
	}

	public void setImage(byte[] image) {
		this.ArtistImage = image;
	}

	public List<Movie> getAllMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
