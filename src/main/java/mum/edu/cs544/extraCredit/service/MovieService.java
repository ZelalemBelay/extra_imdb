package mum.edu.cs544.extraCredit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.extraCredit.business.Genre;
import mum.edu.cs544.extraCredit.business.Movie;
import mum.edu.cs544.extraCredit.business.Rating;
import mum.edu.cs544.extraCredit.dataAccess.MovieEntityDao;


@Transactional
public class MovieService implements IMovieService {

	private MovieEntityDao movieDao;

	@Autowired
	public void setMovieDao(MovieEntityDao repository){
		this.movieDao = repository;
	}
	

	@Override
	public void saveMovie(Movie movie) {
		// TODO Auto-generated method stub
		movieDao.save(movie);
	}


	@Override
	public Movie SearchMovieById(int id) {
		// TODO Auto-generated method stub
		return movieDao.findOne(id);
	}


	@Override
	public List<Movie> SearchMovieByName(String name) {
		// TODO Auto-generated method stub
		return movieDao.SearchMovieByName(name);
	}


	@Override
	public List<Movie> SearchMoviesByGenre(Genre genre) {
		// TODO Auto-generated method stub
		return movieDao.SearchMoviesByGenre(genre);
	}


	@Override
	public List<Movie> SearchMoviesByRating(Rating rating) {
		// TODO Auto-generated method stub
		return movieDao.SearchMoviesByRating(rating);
	}


	@Override
	public List<Movie> SearchMoviesByArtistName(String name) {
		// TODO Auto-generated method stub
		return movieDao.SearchMoviesByArtistName(name);
	}


	@Override
	public List<Movie> SearchMoviesByYear(int year) {
		// TODO Auto-generated method stub
		return movieDao.SearchMoviesByYear(year);
	}


	@Override
	public void updateMovie(int id, Movie movie) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteMovie(int id) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Movie> getAllMovies() {
		return movieDao.findAll();
	}

}
