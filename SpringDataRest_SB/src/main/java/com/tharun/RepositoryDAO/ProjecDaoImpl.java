package com.tharun.RepositoryDAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tharun.Entities.FresherEntity;

@Repository
public class ProjecDaoImpl implements ProjectDao{

	@Autowired
	public ProjectRepo repo;

	@Override
	public FresherEntity addFresherDetails(FresherEntity fb) {
		System.out.println(fb.toString());
		FresherEntity entity = new FresherEntity();
		BeanUtils.copyProperties(fb,entity);
		System.out.println("entity -> "+entity.toString());
		FresherEntity savedEntity = repo.save(entity);
		FresherEntity savedBean = new FresherEntity();
		System.out.println("saved Bean Details -> "+savedBean);
		BeanUtils.copyProperties(savedEntity, savedBean);
		return savedBean;
	}

	@Override
	public FresherEntity updateFresherDetails(FresherEntity fb) {
		FresherEntity updatedBean = null;
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
			updatedBean = new FresherEntity();
			System.out.println("updated Bean Details -> "+updatedBean);
			BeanUtils.copyProperties(updatedEntity,updatedBean);
			return updatedBean;
		}
		return updatedBean;
		
	}

	@Override
	public FresherEntity getFresherDetails(Integer id) {
		System.out.println("inside get");
		FresherEntity entity = repo.findById(id).orElse(null);
		FresherEntity bean = new FresherEntity();
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

	@Override
	public List<FresherEntity> getAllFresher() {
		System.out.println("inside get All");
		List<FresherEntity> list = repo.findAll();
		List<FresherEntity> listBean = new ArrayList<FresherEntity>();
		for(FresherEntity entity:list)
		{
			FresherEntity bean = new FresherEntity();
			BeanUtils.copyProperties(entity, bean);
			listBean.add(bean);
		}
		return listBean;
	}

	@Override
	public List<FresherEntity> findByName(String name) {
		System.out.println("----------------");
		System.out.println("find by id less than 198825");
		System.out.println(repo.findByFresherIdLessThan(198825));
		System.out.println("-----------------");
		System.out.println("find by id less than equal to 198825");
		System.out.println(repo.findByfresherIdLessThanEqual(198825));
		System.out.println("------------------");
		System.out.println("find by id greater than 198825");
		System.out.println(repo.findByFresherIdGreaterThan(198825));
		System.out.println("------------------");
		System.out.println("find by id greater than equal to 198825");
		System.out.println(repo.findByFresherIdGreaterThanEqual(198825));
		System.out.println("------------------");
		System.out.println("find all whose skill is java");
		System.out.println(repo.findByFresherPrimarySkill("java"));
		System.out.println("-------------------");
		System.out.println("find all whose skill is java sort by name asc");
		System.out.println(repo.findByFresherPrimarySkillOrderByFresherName("java"));
		System.out.println("-------------------");
		System.out.println("find all whose skill is java sort by name descending");
		System.out.println(repo.findByFresherPrimarySkillOrderByFresherNameDesc("java"));
		System.out.println("-------------------");
		System.out.println("find ids between 198824 to 198827 inclusive");
		System.out.println(repo.findByFresherIdBetween(198824,198827));
		System.out.println("-------------------");
		System.out.println("find all skills which contains stack in it");
		System.out.println(repo.findByFresherPrimarySkillContaining("stack"));
		System.out.println("--------------------");
		System.out.println("find by name john doe or who has primary skill javafullstack");
		System.out.println(repo.findByFresherNameOrFresherPrimarySkill("john doe","fullstackjava"));
		System.out.println("--------------------");
		System.out.println("find by name");
		return repo.findByfresherName(name);
	}
	
	
	
	
}
