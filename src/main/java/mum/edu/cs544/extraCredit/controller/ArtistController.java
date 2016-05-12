package mum.edu.cs544.extraCredit.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import mum.edu.cs544.extraCredit.business.Artist;
import mum.edu.cs544.extraCredit.service.IArtistService;

@Controller
public class ArtistController {

	
	@Autowired
	private IArtistService artistService;

	public void setArtistService(IArtistService artistService) {
		this.artistService = artistService;
	}

	   @RequestMapping({"/","artist"})
	   public ModelAndView homepage() {
		   
		ModelAndView modelandview = new ModelAndView("ArtistCRUD");
		return modelandview;
	   }
//	   
	@RequestMapping(value = "/artists", method = RequestMethod.GET)
	public ModelAndView insert() {

		List<Artist> artistList = artistService.getAllArtists();
		ModelAndView modelandview = new ModelAndView("artistsListingPage");
		modelandview.addObject(artistList);
		
		return modelandview;
	}
	
// Insert Artist
	
	@RequestMapping(value = "/artist/add", method = RequestMethod.GET)
	public ModelAndView add(@Valid Artist artist) {

		ModelAndView modelandview = new ModelAndView("ArtistCRUD");
		modelandview.addObject("func","Add");

		artistService.InsertArtist(artist);

		return modelandview;
	}
	
	@RequestMapping(value = "/artist/delete", method = RequestMethod.GET)
	public ModelAndView update(@Valid Artist artist) {

		ModelAndView modelandview = new ModelAndView("ArtistCRUD");
		artistService.InsertArtist(artist);
		modelandview.addObject("func","Update");

		return modelandview;
	}
	
	@RequestMapping(value = "/artist/update", method = RequestMethod.GET)
	public ModelAndView delete(@Valid Artist artist) {

		ModelAndView modelandview = new ModelAndView("ArtistCRUD");
		modelandview.addObject("func","delete");

		artistService.InsertArtist(artist);

		return modelandview;
	}
	
	
//
//	
//	

}
