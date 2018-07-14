package com.sradio.llater.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sradio.llater.domain.AudioURL;
import com.sradio.llater.repos.URLRepo;

@Service
public class LLaterServiceImpl implements LLaterService {

	@Autowired
	private URLRepo repo;

	@Override
	public List<AudioURL> addUrl( String owningUser, String url) {
		repo.save(AudioURL.builder().owningUser(owningUser).url(url).build());
		return repo.findAllByOwningUser(owningUser);
	}
}
