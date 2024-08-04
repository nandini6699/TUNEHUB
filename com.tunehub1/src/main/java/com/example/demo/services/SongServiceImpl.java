package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Song;
import com.example.demo.repositories.SongRepository;

@Service
public class SongServiceImpl implements SongService {
	@Autowired
	SongRepository repo;
	

	@Override
	public void addSong(Song song) {
		repo.save(song);
		
	}


	@Override
	public boolean songExists(String name) {
		if(repo.findByName(name)==null) {
		return false;
		}
		else {
			return true;
		}
	}


	@Override
	public List<Song> fetchAllSongs() {
		
		return repo.findAll();
	}


	@Override
	public void updateSong(Song song) {
		repo.save(song);
		
	}



}
