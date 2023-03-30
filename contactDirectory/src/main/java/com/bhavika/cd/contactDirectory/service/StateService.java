package com.bhavika.cd.contactDirectory.service;

import java.util.List;

import com.bhavika.cd.contactDirectory.entity.State;

public interface StateService {
	
	public List<State> getStates();

	public State getState(int stateId);

}
