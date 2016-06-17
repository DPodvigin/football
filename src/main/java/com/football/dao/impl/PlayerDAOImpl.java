package com.football.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.football.dao.PlayerDAO;
import com.football.model.Player;
import com.football.repository.PlayerRepository;

@Component
public class PlayerDAOImpl implements PlayerDAO {
	
	private PlayerRepository playerRepository;
	
	@Autowired
	public PlayerDAOImpl(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	public void createPlayer(Player player) {
		playerRepository.save(player);
	}
	
	public Player findByName(String playerName) {
		return playerRepository.findByUsername(playerName);
	}
}
