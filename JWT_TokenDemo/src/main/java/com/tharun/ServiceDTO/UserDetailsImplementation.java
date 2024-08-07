package com.tharun.ServiceDTO;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.tharun.Entity.UsersEntity;

//also called UserPrincipal
//Principal just means current user
public class UserDetailsImplementation implements UserDetails{

	//Accepting user object from MyUserDetailsService
	//user obect gives us username and password
	private UsersEntity userObj2;
	
	public UserDetailsImplementation(UsersEntity userObj)
	{
		System.out.println("inside userDetailsImplementation");
		this.userObj2 = userObj;
	}
	
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getPassword() {
		System.out.println("pass "+userObj2.getPassword());
		return userObj2.getPassword();
	}

	@Override
	public String getUsername() {
		System.out.println("username "+userObj2.getUsername());
		return userObj2.getUsername();
	}

}
