package com.football.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.football.dao.PlayerDAO;
import com.football.model.Player;

@Service
public class PlayerService {

	private PlayerDAO playerDAO;
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	public PlayerService(PlayerDAO playerDAO, PasswordEncoder passwordEncoder) {
		this.playerDAO = playerDAO;
		this.passwordEncoder = passwordEncoder;
	}
	
	@Transactional
	public void createPlayer(Player player) {
		player.setPassword(passwordEncoder.encode(player.getPassword()));
		playerDAO.createPlayer(player);
	}
}
