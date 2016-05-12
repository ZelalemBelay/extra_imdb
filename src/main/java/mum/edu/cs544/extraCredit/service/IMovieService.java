package mum.edu.cs544.extraCredit.service;

import java.util.List;

import mum.edu.cs544.extraCredit.business.Genre;
import mum.edu.cs544.extraCredit.business.Movie;
import mum.edu.cs544.extraCredit.business.Rating;


public interface IMovieService {

	void saveMovie(Movie movie);
	void updateMovie(int id, Movie movie);
	void deleteMovie(int id);
	public Movie SearchMovieById(int id);
	
	public List<Movie> getAllMovies();

	public List<Movie> SearchMovieByName(String name);
	public List<Movie> SearchMoviesByGenre (Genre genre);
	public List<Movie> SearchMoviesByRating (Rating rating);
	public List<Movie> SearchMoviesByArtistName(String name);
	public List<Movie> SearchMoviesByYear(int year);
}
