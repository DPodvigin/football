package com.football.dto;

import com.football.model.Team;

public class GlobalBetDTO {

	private String name;
	private Team houseTeam;
	private Team visitorTeam;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getHouseTeam() {
		return houseTeam;
	}

	public void setHouseTeam(Team houseTeam) {
		this.houseTeam = houseTeam;
	}

	public Team getVisitorTeam() {
		return visitorTeam;
	}

	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}
}
