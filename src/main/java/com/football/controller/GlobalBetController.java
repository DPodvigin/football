package com.football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.football.dto.GlobalBetDTO;
import com.football.model.GlobalBet;
import com.football.service.GlobalBetService;

@RestController
@RequestMapping("/globalBet")
public class GlobalBetController {

	private GlobalBetService globalBetService;
	
	@Autowired
	public GlobalBetController(GlobalBetService globalBetService) {
		this.globalBetService = globalBetService;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public void createGlobalBet(@RequestBody GlobalBetDTO globalBetDTO) {
		System.out.println(globalBetDTO);
		//globalBetService.createGlobalBet(globalBet);
	}
}
