package com.tharun.ServiceDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tharun.Entity.UsersEntity;
import com.tharun.RepositoryDAO.userRepo;

@Service
public class UserEntityService {

	@Autowired
	private userRepo repo;
	
	//12 strength
	private BCryptPasswordEncoder bpe = new BCryptPasswordEncoder(12);
	
	public UsersEntity saveUser(UsersEntity user)
	{
		System.out.println("in userEntityService");
		//Bcrypt password
		user.setPassword(bpe.encode(user.getPassword()));
		System.out.println(user.getPassword());
		return repo.save(user);
	}
	
	public UsersEntity getUserById(Integer userId)
	{
		System.out.println("in userEntityService");
		UsersEntity entity =  repo.findById(userId).orElse(null);
		
		return entity;
	}
}
