package com.bhavika.cd.contactDirectory.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhavika.cd.contactDirectory.entity.State;
import com.bhavika.cd.contactDirectory.service.StateService;

@RestController
@RequestMapping("/api")
public class StateController {
	
	private StateService stateService;
	
	private StateController(StateService theStateService) {
		stateService = theStateService;
	}
	
	// expose "/employees" and return list of employees
		@GetMapping("/states")
		public List<State> findAll() {
			return stateService.getStates();
		}
		
		@GetMapping("/state/{id}")
		public State findbyId(@PathVariable int id) {
			State theState = stateService.getState(id);
			
			return theState;
		}
}
