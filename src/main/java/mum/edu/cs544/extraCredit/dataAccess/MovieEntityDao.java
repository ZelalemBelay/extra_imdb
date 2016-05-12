package mum.edu.cs544.extraCredit.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.extraCredit.business.Artist;
import mum.edu.cs544.extraCredit.business.Genre;
import mum.edu.cs544.extraCredit.business.Movie;
import mum.edu.cs544.extraCredit.business.Rating;

import java.util.*;

public interface MovieEntityDao extends JpaRepository<Movie, Integer>{

	List<Movie> SearchMovieByName(String name);
	List<Movie> SearchMoviesByRating(Rating rating);
	
	@Query("FROM Movie m join m.artists a where LOWER(a.name) LIKE '%' + LOWER(:name) + '%'")
	List<Movie> SearchMoviesByArtistName(@Param("name") String name);
	
	List<Movie> SearchMoviesByYear(int year);
	List<Movie> SearchMoviesByGenre(Genre genre);

}
