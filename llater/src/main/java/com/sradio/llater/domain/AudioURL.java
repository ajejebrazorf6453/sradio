package com.sradio.llater.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class AudioURL {
	
	public AudioURL() {
	}
	
	
	public AudioURL(long id, String owningUser, String url, Date insertts) {
		super();
		this.id = id;
		this.owningUser = owningUser;
		this.url = url;
		this.insertts = insertts;
	}


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    private String owningUser;

	private String url;
	
	@Builder.Default private Date insertts= new Date();

}
