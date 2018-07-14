package com.sradio.llater.services;

import java.util.List;

import com.sradio.llater.domain.AudioURL;

public interface LLaterService {

	List<AudioURL> addUrl(String owningUser, String url);

}