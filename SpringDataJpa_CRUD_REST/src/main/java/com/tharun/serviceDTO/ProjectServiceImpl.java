package com.tharun.serviceDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tharun.BusinessBeans.FresherBean;
import com.tharun.RepositoryDAO.ProjectDao;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	public ProjectDao dao;

	@Override
	public FresherBean addFresherDetails(FresherBean fb) {
		System.out.println("inside service impl");
		return dao.addFresherDetails(fb);
	}

	@Override
	public FresherBean updateFresherDetails(FresherBean fb) {
		System.out.println("inside service impl");
		return dao.updateFresherDetails(fb);
	}

	@Override
	public FresherBean getFresherDetails(Integer id) {
		System.out.println("inside service impl");
		return dao.getFresherDetails(id);
	}

	@Override
	public Integer deleteFresherDetails(Integer id) {
		System.out.println("inside service impl");
		return dao.deleteFresherDetails(id);
	}

}
