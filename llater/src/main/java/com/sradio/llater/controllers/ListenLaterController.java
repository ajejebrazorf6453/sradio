package com.sradio.llater.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sradio.llater.services.LLaterService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ListenLaterController {
	
	@Autowired
	LLaterService lLaterService;

	@GetMapping("add")
	public String add( String url, Model model ) {
		log.debug(url);
		model.addAttribute("recentlyAdded",lLaterService.addUrl("andrea", url));
		return "listenlater";
	}
}
