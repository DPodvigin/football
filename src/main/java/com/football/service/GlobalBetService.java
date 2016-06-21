package com.football.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.dao.GlobalBetDAO;
import com.football.model.GlobalBet;

@Service
public class GlobalBetService {

	private GlobalBetDAO globalBetDAO;
	
	@Autowired
	public GlobalBetService(GlobalBetDAO globalBetDAO) {
		this.globalBetDAO = globalBetDAO;
	}
	
	@Transactional
	public void createGlobalBet(GlobalBet globalBet) {
		globalBetDAO.createGlobalBet(globalBet);
	}
}
