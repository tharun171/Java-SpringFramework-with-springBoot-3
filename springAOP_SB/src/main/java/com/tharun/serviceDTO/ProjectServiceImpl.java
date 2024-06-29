package com.tharun.serviceDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tharun.Entities.FresherEntity;
import com.tharun.RepositoryDAO.ProjectDao;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	public ProjectDao dao;
	
	private void serviceStatus()
	{
		System.out.println("inside service impl");
	}

	@Override
	public FresherEntity addFresherDetails(FresherEntity fb) {
		serviceStatus();
		return dao.addFresherDetails(fb);
	}

	@Override
	public FresherEntity updateFresherDetails(FresherEntity fb) {
		serviceStatus();
		return dao.updateFresherDetails(fb);
	}

	@Override
	public FresherEntity getFresherDetails(Integer id) {
		serviceStatus();
		//for achieving AfterThrowing in AOP
		//System.out.println(5/0);
		return dao.getFresherDetails(id);
	}

	@Override
	public Integer deleteFresherDetails(Integer id) {
		serviceStatus();
		return dao.deleteFresherDetails(id);
	}

	@Override
	public List<FresherEntity> getAllFresher() {
		serviceStatus();
		return dao.getAllFresher();
	}

}
