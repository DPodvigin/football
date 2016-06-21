package com.football.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
