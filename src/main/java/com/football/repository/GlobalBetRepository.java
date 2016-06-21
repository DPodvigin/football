package com.football.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.football.model.GlobalBet;

@Repository
public interface GlobalBetRepository extends JpaRepository<GlobalBet, Integer> {
}
