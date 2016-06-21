package com.football.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LOCAL_BET")
public class LocalBet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="PLAYER_ID", nullable=false)
	private Player player;
	
	@ManyToOne
    @JoinColumn(name="GAME_ID", nullable=false)
	private Game game;
	
	@Column(name = "HOME_SCORE")
	private Integer homeScore;
	
	@Column(name = "VISITOR_SCORE")
	private Integer visitorScore;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setGame(Game game) {
		this.game = game;
	}
	
	public Game getGame() {
		return game;
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
}
