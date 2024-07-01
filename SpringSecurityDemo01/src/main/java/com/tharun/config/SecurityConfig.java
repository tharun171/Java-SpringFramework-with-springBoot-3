package com.tharun.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.HttpSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer.AuthorizationManagerRequestMatcherRegistry;
import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.tharun.ServiceDTO.MyUserDetailsService;


//Custom spring security configuration
@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	
	@Autowired
	private UserDetailsService userDetailsService;
	

	//using @Bean - by default spring creates object for us
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		//disabling csrf
		//name can be anything not only customizer
		//http.csrf(customizer -> customizer.disable());
		//or
		/*
		Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new Customizer<CsrfConfigurer<HttpSecurity>>() {
			
			@Override
			public void customize(CsrfConfigurer<HttpSecurity> abc) {
				abc.disable();
			}
		};
		http.csrf(custCsrf);
		*/
		
		//enable username and password - application.properties
		//http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
		//or
		/*
		Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry> cust =  new 
				Customizer<AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry>() {
					
					@Override
					public void customize(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry t) {
						// TODO Auto-generated method stub
						t.anyRequest().authenticated();
					}
				};
		http.authorizeHttpRequests(cust);
		*/
		
		
		//to enable the login form
		//(we wont be needing formLogin when app is stateless)
		//when form is stateless, everytime a new session id will be created
		//http.formLogin(Customizer.withDefaults());
		
		//use httpbasic for the security - username and password
		//http.httpBasic(Customizer.withDefaults());
		
		//want to make it stateless
		//so everytime a new session we will get
		//since we are making it stateless we can only use REST API - via postman we can use
		//or when disabled formLogin we can see in browser itself
		//not for the same request we get different session id everytime
		//http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		
		
		http
			.csrf(customizer -> customizer.disable())
			.authorizeHttpRequests(request -> request.anyRequest().authenticated())
			//.formLogin(Customizer.withDefaults())
			.httpBasic(Customizer.withDefaults())
			.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		
		return http.build();
	}
	
	
	@Bean
	public AuthenticationProvider authProvider()
	{
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		
		//connecting with user data
		provider.setUserDetailsService(userDetailsService);
		//Bcrypt everywhere in this project used strength 12
		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		
		
		return provider;
	}
	
	
	@Bean
	public UserDetailsService userDetailsService()
	{
		
		/*
		UserDetails user = User
				//not recommended as it is deprecated
							.withDefaultPasswordEncoder()
							.username("tharun")
							.password("t@123")
							.roles("USER")
							.build();
		UserDetails admin = User
				//not recommended as it is deprecated
							.withDefaultPasswordEncoder()
							.username("tharunadmin")
							.password("t@123admin")
							.roles("ADMIN")
							.build();
		return new InMemoryUserDetailsManager(user,admin);
		*/	
		return new MyUserDetailsService();
	}
}
