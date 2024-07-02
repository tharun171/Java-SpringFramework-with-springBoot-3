package com.tharun.ServiceDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tharun.Entity.UsersEntity;
import com.tharun.RepositoryDAO.userRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private userRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UsersEntity userObj = repo.findByUsername(username);
		System.out.println("userObj "+userObj);
		if(userObj == null)
		{
			System.out.println("user 404 not found");
			throw new UsernameNotFoundException("user 404");
		}
		
		return new UserDetailsImplementation(userObj);
	}

}
