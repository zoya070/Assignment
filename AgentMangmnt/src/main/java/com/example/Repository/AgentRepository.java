package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Integer> {
    
}

