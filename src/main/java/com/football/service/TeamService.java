package com.football.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.football.dao.TeamDAO;
import com.football.model.Team;

@Service
public class TeamService {

	private TeamDAO teamDAO;
	
	@Autowired
	public TeamService(TeamDAO teamDAO) {
		this.teamDAO = teamDAO;
	}
	
	public List<Team> getAllTeams() {
		return teamDAO.getAllTeams();
	}
}
