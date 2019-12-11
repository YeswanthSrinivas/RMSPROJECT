package com.sathya.admin.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class State{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String stId;
	private String stName;
	
	@OneToMany(mappedBy = "state")
	private Set<City> city;
	
	public Set<City> getCity() {
		return city;
	}
	public void setCity(Set<City> city) {
		this.city = city;
	}
	
	public State() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStId() {
		return stId;
	}
	public void setStId(String stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	@Override
	public String toString() {
		return "State [id=" + id + ", stId=" + stId + ", stName=" + stName + ", city=" + city + "]";
	}
	
	
	
}
