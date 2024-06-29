package com.tharun.RepositoryDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.tharun.Entities.FresherEntity;


@Component
@Repository
public interface ProjectRepo extends JpaRepository<FresherEntity,Integer>{

}
