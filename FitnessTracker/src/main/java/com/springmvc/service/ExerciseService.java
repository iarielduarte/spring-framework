package com.springmvc.service;

import java.util.List;

import com.springmvc.model.Activity;

public interface ExerciseService {

	public abstract List<Activity> findAllActivities();

}