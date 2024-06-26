package com.tharun.RepositoryDAO;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tharun.BusinessBeans.FresherBean;
import com.tharun.Entities.FresherEntity;

@Repository
public class ProjecDaoImpl implements ProjectDao{

	@Autowired
	public ProjectRepo repo;

	@Override
	public FresherBean addFresherDetails(FresherBean fb) {
		System.out.println(fb.toString());
		FresherEntity entity = new FresherEntity();
		BeanUtils.copyProperties(fb,entity);
		System.out.println("entity -> "+entity.toString());
		FresherEntity savedEntity = repo.save(entity);
		FresherBean savedBean = new FresherBean();
		System.out.println("saved Bean Details -> "+savedBean);
		BeanUtils.copyProperties(savedEntity, savedBean);
		return savedBean;
	}

	@Override
	public FresherBean updateFresherDetails(FresherBean fb) {
		FresherBean updatedBean = null;
		FresherEntity entity = repo.findById(fb.getFresherId()).orElse(null);
		if(entity == null)
		{
			System.out.println("can't do update operation");
		}
		else
		{
			entity.setFresherDoj(fb.getFresherDoj());
			entity.setFresherName(fb.getFresherName());
			entity.setFresherPrimarySkill(fb.getFresherPrimarySkill());
			FresherEntity updatedEntity = repo.save(entity);
			updatedBean = new FresherBean();
			System.out.println("updated Bean Details -> "+updatedBean);
			BeanUtils.copyProperties(updatedEntity,updatedBean);
			return updatedBean;
		}
		return updatedBean;
		
	}

	@Override
	public FresherBean getFresherDetails(Integer id) {
		System.out.println("inside get");
		FresherEntity entity = repo.findById(id).orElse(null);
		FresherBean bean = new FresherBean();
		BeanUtils.copyProperties(entity,bean);
		System.out.println("Details of fresher with id: "+id+" "+bean.toString());
		return bean;
	}

	@Override
	public Integer deleteFresherDetails(Integer id) {
		System.out.println("inside delete");
		FresherEntity entity = repo.findById(id).orElse(null);
		if(entity == null)
		{
			System.out.println("id doesn't exist");
			return 0;
		}
		else
		{
			repo.delete(entity);
			return 1;
		}
	}
	
	
	
	
}
