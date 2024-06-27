package com.tharun.RepositoryDAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.tharun.Entities.FresherEntity;


@Component
@Repository
public interface ProjectRepo extends JpaRepository<FresherEntity,Integer>{

	/*
	 * JPQL - uses entity variables 
	@Query("select s from FresherEntity s where s.fresherName=?1")
	 */
	
	//custom methods thats supported by spring data jpa
	List<FresherEntity> findByfresherName(String name);
	
	//get all id less than 
	List<FresherEntity> findByFresherIdLessThan(Integer id);
	
	//get all id less than equal to
	List<FresherEntity> findByfresherIdLessThanEqual(Integer id);
	
	//get all id greater than 
	List<FresherEntity> findByFresherIdGreaterThan(Integer id);
	
	//get all id greater than equal to
	List<FresherEntity> findByFresherIdGreaterThanEqual(Integer id);
	
	//get all id from 198824 to 198827
	List<FresherEntity> findByFresherIdBetween(Integer startId,Integer endId);
	
	//get all by skill
	List<FresherEntity> findByFresherPrimarySkill(String skillName);
	
	//get all by skill and sort by their name
	List<FresherEntity> findByFresherPrimarySkillOrderByFresherName(String skillName);
	
	//get all by skill and sort by name descending
	List<FresherEntity> findByFresherPrimarySkillOrderByFresherNameDesc(String skillName);

	//get all skills that contain stack in skill name
	List<FresherEntity> findByFresherPrimarySkillContaining(String skill);
	
	//get fresher named john doe or who have primary skill as fullstackjava
	List<FresherEntity> findByFresherNameOrFresherPrimarySkill(String name,String skill);

}
