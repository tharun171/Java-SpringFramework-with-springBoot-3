package com.tharun.serviceDTO;

import java.util.List;

import com.tharun.Entities.FresherEntity;

public interface ProjectService {

	FresherEntity addFresherDetails(FresherEntity fb);
	
	FresherEntity updateFresherDetails(FresherEntity fb);
	
	FresherEntity getFresherDetails(Integer id);
	
	Integer deleteFresherDetails(Integer id);
	
	List<FresherEntity> getAllFresher();
	
	//Custom methods
	List<FresherEntity> findByName(String name);
}
