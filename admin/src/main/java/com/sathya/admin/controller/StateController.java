package com.sathya.admin.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.admin.entity.State;
import com.sathya.admin.service.StateService;

@RestController
@RequestMapping(path = "/states")
public class StateController {
	
	private static final Logger logger=LogManager.getLogger(StateController.class);
	
	@Autowired
	private StateService stateService;
	
	@GetMapping(path = "/getAllStates")
	public Iterable<State> getAllStates(){
		logger.info("Get All Metho States Execution Started");
		Iterable<State> result=null;
		try {
			result=stateService.getAllStates();
			logger.debug("result is {0}",result);
			
		} catch (Exception e) {
			logger.error("exception happens and exception info is {0}",e);
		}
		logger.info("get All states method execution completed");
		return result;
		
	}
	
	
	@PostMapping(path = "/addState")
	public State addState(@RequestBody State state) {
		logger.info("Insert State Method Execution Started");
		logger.debug("Input data is {0}",state);
		State result=null;
		try {
			result=stateService.insertState(state);
			logger.debug("Input data is {0}",result);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Input Data is {0}",state);
		}
		logger.info("Insert State Method Execution Completed");
		return result;
		
	}
	
	@PutMapping(path = "/updateState")
	public State updateState(@RequestBody State state) {
		logger.info("Update State Method Execution Started");
		logger.debug("Update data is {0}",state);
		State result=null;
		try {
			result=stateService.updateState(state);
			logger.debug("Input data is {0}",result);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Update Data is {0}",state);
		}
		logger.info("Update State Method Execution Completed");
		return stateService.updateState(state);
		
	}
	
	@DeleteMapping(path = "/deleteState/{id}")
	public void deleteState(@PathVariable("id") Integer id) {
		
		stateService.deleteState(id);
		
	}

}
