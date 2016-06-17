package com.football.dao;

import org.springframework.stereotype.Repository;

import com.football.model.Player;

@Repository
public interface PlayerDAO {

	public void createPlayer(Player player);
	
	public Player findByName(String playerName);
}
