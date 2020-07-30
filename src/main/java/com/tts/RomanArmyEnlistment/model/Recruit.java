package com.tts.RomanArmyEnlistment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recruit {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id; 
	
    private String name;
    private String city;
    
    public Recruit() {
	}
    
	public Recruit(Long id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Recruit [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
    
    
    
}
