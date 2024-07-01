package com.tharun.RepositoryDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.tharun.Entity.UsersEntity;

@Repository
@Component
public interface userRepo extends JpaRepository<UsersEntity,Integer>{

	
	//Built in support for these methods
	//FindBy fieldName
	UsersEntity findByUsername(String name);
	
}
