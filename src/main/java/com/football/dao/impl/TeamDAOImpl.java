package com.football.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.football.dao.TeamDAO;
import com.football.model.Team;
import com.football.repository.TeamRepository;

@Component
public class TeamDAOImpl implements TeamDAO {
	
	private TeamRepository teamRepository;
	
	@Autowired
	public TeamDAOImpl(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}
}
