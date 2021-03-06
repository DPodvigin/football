package com.football.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
	
	public Player findByUsername(String username);
}
