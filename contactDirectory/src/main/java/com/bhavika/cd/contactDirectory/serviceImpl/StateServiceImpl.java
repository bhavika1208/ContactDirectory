package com.bhavika.cd.contactDirectory.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhavika.cd.contactDirectory.entity.State;
import com.bhavika.cd.contactDirectory.repository.StateRepository;
import com.bhavika.cd.contactDirectory.service.StateService;

@Service
public class StateServiceImpl implements StateService {

	private StateRepository stateRepository;	
	
	@Autowired
	public StateServiceImpl(StateRepository theStateRepository){
		stateRepository = theStateRepository;
	}
	
	@Override
	public List<State> getStates() {
		return stateRepository.findAll();
	}

	@Override
	public State getState(int stateId) {
		
		Optional<State> result = stateRepository.findById(stateId);
		
		State theState = null;
		
		if (result.isPresent()) {
			theState = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find employee id - " + stateId);
		}
		
		return theState;
	}

}
