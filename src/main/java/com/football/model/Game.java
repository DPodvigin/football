package com.football.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GAME")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="HOME_TEAM_ID", nullable=false)
	private Team homeTeam;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="VISITOR_TEAM_ID", nullable=false)
	private Team visitorTeam;
	
	@ManyToOne
    @JoinColumn(name="GLOBAL_BET_ID", nullable=false)
	private GlobalBet globalBet;
	
	@Column(name = "HOME_SCORE")
	private Integer homeScore;
	
	@Column(name = "VISITOR_SCORE")
	private Integer visitorScore;
	
	@OneToMany(mappedBy="game")
	private Set<LocalBet> localBets;
 	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	
	public Team getHomeTeam() {
		return homeTeam;
	}
	
	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}
	
	public Team getVisitorTeam() {
		return visitorTeam;
	}
	
	public void setGlobalBet(GlobalBet globalBet) {
		this.globalBet = globalBet;
	}
	
	public GlobalBet getGlobalBet() {
		return globalBet;
	}
	
	public void setHomeScore(Integer homeScore) {
		this.homeScore = homeScore;
	}
	
	public Integer getHomeScore() {
		return homeScore;
	}
	
	public void setVisitorScore(Integer visitorScore) {
		this.visitorScore = visitorScore;
	}
	
	public Integer getVisitorScore() {
		return visitorScore;
	}
	
	public void setLocalBets(Set<LocalBet> localBets) {
		this.localBets = localBets;
	}
	
	public Set<LocalBet> getLocalBets() {
		return localBets;
	}
}
