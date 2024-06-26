package com.tharun.RepositoryDAO;

import com.tharun.BusinessBeans.FresherBean;

public interface ProjectDao {

	FresherBean addFresherDetails(FresherBean fb);
	
	FresherBean updateFresherDetails(FresherBean fb);
	
	FresherBean getFresherDetails(Integer id);
	
	Integer deleteFresherDetails(Integer id);
}
