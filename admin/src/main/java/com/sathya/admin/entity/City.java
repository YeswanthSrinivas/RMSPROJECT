package com.sathya.admin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String ctId;
	private String ctName;
	
	@Transient
	private String stId;
	
	@ManyToOne
	@JoinColumn(name="ST_ID")
	private State state;

	public City() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCtId() {
		return ctId;
	}

	public void setCtId(String ctId) {
		this.ctId = ctId;
	}

	public String getCtName() {
		return ctName;
	}

	public void setCtName(String ctName) {
		this.ctName = ctName;
	}

	public String getStId() {
		return stId;
	}

	public void setStId(String stId) {
		this.stId = stId;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", ctId=" + ctId + ", ctName=" + ctName + ", stId=" + stId + ", state=" + state + "]";
	}
	
	

}
