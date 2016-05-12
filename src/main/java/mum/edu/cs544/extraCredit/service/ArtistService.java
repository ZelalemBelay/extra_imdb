package mum.edu.cs544.extraCredit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.cs544.extraCredit.business.Artist;
import mum.edu.cs544.extraCredit.dataAccess.ArtistEntityDao;


@Transactional
public class ArtistService implements IArtistService {
	
	@Autowired
	private ArtistEntityDao artistDao;

	public void setArtistEntryDao(ArtistEntityDao repository){
		this.artistDao = repository;
	}
	

	@Override
	public List<Artist> getAllArtists() {
		return artistDao.findAll();
	}

	@Override
	public void InsertArtist(Artist artist) {
		// TODO Auto-generated method stub
		artistDao.save(artist);
	}

	@Override
	public void DeleteArtist(int id) {
		// TODO Auto-generated method stub
		
		// Little modification on the hibernate delete and update.
	}

	@Override
	public Artist FindArtistById(int id) {
		// TODO Auto-generated method stub
		return artistDao.findOne(id);
	}

	@Override
	public void UpdateArtist(int id, Artist artist) {
		// TODO Auto-generated method stub
	}

}
