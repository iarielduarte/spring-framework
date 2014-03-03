package com.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springmvc.model.Activity;


@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	/* (non-Javadoc)
	 * @see com.springmvc.service.ExerciseService#findAllActivities()
	 */
	public List<Activity> findAllActivities(){
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swin = new Activity();
		swin.setDesc("Swin");
		activities.add(swin);
		
		return activities;
		
	}
}
