package com.football.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.football.dao.GlobalBetDAO;
import com.football.model.GlobalBet;
import com.football.repository.GlobalBetRepository;

@Component
public class GlobalBetDAOImpl implements GlobalBetDAO {
	
	private GlobalBetRepository globalBetRepository;
	
	@Autowired
	public GlobalBetDAOImpl(GlobalBetRepository globalBetRepository) {
		this.globalBetRepository = globalBetRepository;
	}

	public void createGlobalBet(GlobalBet globalBet) {
		globalBetRepository.save(globalBet);
	}
}
