package com.football.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.football.model.Team;
import com.football.service.TeamService;

@RestController
@RequestMapping("/teams")
public class TeamController {

	private TeamService teamService;
	
	@Autowired
	public TeamController(TeamService teamService) {
		this.teamService = teamService;
	}
	
	@RequestMapping("/all")
	public List<Team> getAllTeams() {
		return teamService.getAllTeams();
	}
}
