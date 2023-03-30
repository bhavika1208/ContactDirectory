package com.bhavika.cd.contactDirectory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="state")
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stateId")
	private int stateId;
	
	@Column(name = "stateName")
	private String stateName;
		
	public State() {
	}
	public int getStateId() {
		return stateId;
	}
	public State(String stateName) {
		super();
		this.stateName = stateName;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + "]";
	}
	
	
//	select s1_0.state_id,s1_0.state_name from state s1_0
}
