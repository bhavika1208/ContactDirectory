package com.bhavika.cd.contactDirectory.entity;

public class State {
	
	private int stateId;
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
	
	

}
