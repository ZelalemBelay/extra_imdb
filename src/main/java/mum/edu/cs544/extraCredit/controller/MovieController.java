package mum.edu.cs544.extraCredit.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mum.edu.cs544.extraCredit.business.Artist;
import mum.edu.cs544.extraCredit.business.Movie;
import mum.edu.cs544.extraCredit.service.IArtistService;
import mum.edu.cs544.extraCredit.service.IMovieService;

@Controller
public class MovieController {

	
	@Autowired
	private IMovieService movieService;

	public void setArtistService(IMovieService movieService) {
		this.movieService = movieService;
	}

	   @RequestMapping({"movie"})
	   public ModelAndView homepageMovie() {
		   
		ModelAndView modelandview = new ModelAndView("MovieCRUD");
		return modelandview;
	   }
//	   
	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public ModelAndView insert() {

		List<Movie> moviesList = movieService.getAllMovies();
		ModelAndView modelandview = new ModelAndView("moviesListingPage");
		modelandview.addObject(moviesList);
		
		return modelandview;
	}
	
// Insert Artist
	
	@RequestMapping(value = "/movies/add", method = RequestMethod.GET)
	public ModelAndView add(@Valid Movie movie) {

		ModelAndView modelandview = new ModelAndView("MovieCRUD");
		modelandview.addObject("func","Add");

		movieService.saveMovie(movie);

		return modelandview;
	}
	
	@RequestMapping(value = "/movie/delete", method = RequestMethod.GET)
	public ModelAndView update(@Valid Movie movie) {

		ModelAndView modelandview = new ModelAndView("MovieCRUD");
		movieService.saveMovie(movie);
		modelandview.addObject("func","Update");

		return modelandview;
	}
	
	@RequestMapping(value = "/movie/update", method = RequestMethod.GET)
	public ModelAndView delete(@Valid Movie movie) {

		ModelAndView modelandview = new ModelAndView("ArtistCRUD");
		modelandview.addObject("func","delete");

		movieService.saveMovie(movie);

		return modelandview;
	}
	
	
//
//	
//	

}
