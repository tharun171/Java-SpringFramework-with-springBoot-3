package com.tharun.RepositoryDAO;

import java.util.List;

import com.tharun.Entities.FresherEntity;

public interface ProjectDao {

	FresherEntity addFresherDetails(FresherEntity fb);
	
	FresherEntity updateFresherDetails(FresherEntity fb);
	
	FresherEntity getFresherDetails(Integer id);
	
	Integer deleteFresherDetails(Integer id);
	
	List<FresherEntity> getAllFresher();
}
