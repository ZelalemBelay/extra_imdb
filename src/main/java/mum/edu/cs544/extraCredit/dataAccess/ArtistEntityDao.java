package mum.edu.cs544.extraCredit.dataAccess;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mum.edu.cs544.extraCredit.business.Artist;
import mum.edu.cs544.extraCredit.business.Movie;

public interface ArtistEntityDao extends JpaRepository<Artist, Integer>{

	List<Artist> getByName(String name);

	//get By Movies Workded In, birth place and summary
	
	List<Artist> getByMovies(List<Movie> movies);
	
	@Query("FROM Artist a where LOWER(a.birthPlace) LIKE '%' + LOWER(:birthPlace) + '%'")
	List<Artist> getByBirthPlace(@Param("birthPlace") String birthPlace);
	
	@Query("FROM Artist a where LOWER(a.summary) LIKE '%' + LOWER(:summary) + '%'")
	List<Artist> getBySummary(String summary);
	
}
