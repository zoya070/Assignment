package com.example.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.Entity.Agent;

import com.example.Repository.AgentRepository;

import com.example.Service.AgentService;

@Repository
public class AgentServiceImpl implements AgentService {
@Autowired
	AgentRepository agentRepository;

	@Override
	public Agent addAgent(Agent agent) {
		// TODO Auto-generated method stub
		return agentRepository.save(agent);
	}

	@Override
	public List<Agent> getAllAgent() {
		// TODO Auto-generated method stub
		return agentRepository.findAll();
	}

	@Override
	public void deleteAgent(int id) {
		// TODO Auto-generated method stub
		agentRepository.deleteById(id);
	}

	@Override
	public Agent UpdateAgent(Agent agent) {
		// TODO Auto-generated method stub
		Agent _agent=agentRepository.findById(agent.getId()).get();
		_agent.setName(agent.getName());
		_agent.setSalary(agent.getSalary());
		
		agentRepository.save(_agent);
		return _agent;
	}

	@Override
	public Agent createAgent(Agent agent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
