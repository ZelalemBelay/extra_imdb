package mum.edu.cs544.extraCredit.service;

import java.util.List;

import mum.edu.cs544.extraCredit.business.Artist;


public interface IArtistService {

	List<Artist> getAllArtists();
	
	void InsertArtist(Artist artist);
	void DeleteArtist(int id);
	
	Artist FindArtistById(int id);
	void UpdateArtist(int id, Artist artist);

}
