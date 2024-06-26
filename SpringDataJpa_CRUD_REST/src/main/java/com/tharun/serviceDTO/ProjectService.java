package com.tharun.serviceDTO;

import com.tharun.BusinessBeans.FresherBean;

public interface ProjectService {

	FresherBean addFresherDetails(FresherBean fb);
	
	FresherBean updateFresherDetails(FresherBean fb);
	
	FresherBean getFresherDetails(Integer id);
	
	Integer deleteFresherDetails(Integer id);
}
