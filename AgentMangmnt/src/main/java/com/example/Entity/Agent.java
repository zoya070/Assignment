package com.example.Entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agents")
public class Agent {
    
    @Id
    
    int id;
    
    
     String name;
    
    
     int salary;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}




	
    
     
    // getters and setters
}

