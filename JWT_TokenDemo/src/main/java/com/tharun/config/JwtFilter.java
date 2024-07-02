package com.tharun.config;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.tharun.ServiceDTO.MyUserDetailsService;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//Creating JWT Filter
@Component
public class JwtFilter extends OncePerRequestFilter{
	
	
	  @Autowired
	    JwtService jwtService;

	    @Autowired
	    ApplicationContext context;

	    @Override
	    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

	        String authHeader = request.getHeader("Authorization");
	        String token = null;
	        String userName = null;

	        if(authHeader != null && authHeader.startsWith("Bearer ")){
	            token = authHeader.substring(7);
	            userName = jwtService.extractUserName(token);
	        }

	        if(userName != null && SecurityContextHolder.getContext().getAuthentication()==null){

	            UserDetails userDetails = context.getBean(MyUserDetailsService.class).loadUserByUsername(userName);

	            if(jwtService.validateToken(token, userDetails)){
	                UsernamePasswordAuthenticationToken authToken =
	                        new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
	                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	                SecurityContextHolder.getContext().setAuthentication(authToken);
	            }
	        }
	        filterChain.doFilter(request, response);
	    }
	/*
	@Autowired
	JwtService jwtService;
	
	@Autowired
	ApplicationContext context;

	@Override
	protected void doFilterInternal(HttpServletRequest request, 
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException 
	{
		//we get username from the HttpServletRequest
		
		//getting header info, in that getting Authorization
		String header = request.getHeader("Authorization");
		String token = null;
		String userName = null;
		if(header!=null && header.startsWith("Bearer "))
		{
			//7 becoz bearer and a space = 6 in indexing
			token = header.substring(7);
			//extracting username from token
			userName = jwtService.extractUserName(token);
		}
		
		//validating the token
		//checking if we already have an authentication(Bearer Token)
		//checking if user already has sent the Bearer Token
		if(userName!=null && SecurityContextHolder.getContext()
				.getAuthentication()==null)
		{
			//validating token
			UserDetails userDetails = context.getBean(MyUserDetailsService.class)
					.loadUserByUsername(userName);
			if(jwtService.validateToken(token,userDetails))
			{
				UsernamePasswordAuthenticationToken authToken = 
						new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
				
				authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				//setting security context
				SecurityContextHolder.getContext().setAuthentication(authToken);
				
			}
			//generating AuthenticationObject
			filterChain.doFilter(request, response);
		}
		
	}
	*/

}
