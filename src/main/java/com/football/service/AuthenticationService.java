package com.football.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.football.dao.PlayerDAO;
import com.football.model.Player;

@Service
public class AuthenticationService implements UserDetailsService {
	
	private PlayerDAO playerDAO;
	
	@Autowired
	public AuthenticationService(PlayerDAO playerDAO) {
		this.playerDAO = playerDAO;
	}

	@Override
	public UserDetails loadUserByUsername(String username) {
		Player player = playerDAO.findByName(username);
		GrantedAuthority authority = new SimpleGrantedAuthority("USER");
		UserDetails userDetails = (UserDetails)new User(player.getUsername(), 
				player.getPassword(), Arrays.asList(authority));
		return userDetails;
	}
}
