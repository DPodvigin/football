package com.football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.football.model.Player;
import com.football.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {

	private PlayerService playerService;
	
	@Autowired
	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<String> createPlayer(@RequestBody Player player) throws JsonProcessingException {
		try {
			playerService.createPlayer(player);
		} catch (DataIntegrityViolationException e) {
			return new ResponseEntity<>("\"username.exists\"", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>("\"OK\"", HttpStatus.CREATED);
	}
}
