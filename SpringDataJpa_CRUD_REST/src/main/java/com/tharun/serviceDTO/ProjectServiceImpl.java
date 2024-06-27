package com.tharun.serviceDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tharun.BusinessBeans.FresherBean;
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
	public FresherBean addFresherDetails(FresherBean fb) {
		serviceStatus();
		return dao.addFresherDetails(fb);
	}

	@Override
	public FresherBean updateFresherDetails(FresherBean fb) {
		serviceStatus();
		return dao.updateFresherDetails(fb);
	}

	@Override
	public FresherBean getFresherDetails(Integer id) {
		serviceStatus();
		return dao.getFresherDetails(id);
	}

	@Override
	public Integer deleteFresherDetails(Integer id) {
		serviceStatus();
		return dao.deleteFresherDetails(id);
	}

	@Override
	public List<FresherBean> getAllFresher() {
		serviceStatus();
		return dao.getAllFresher();
	}

}
