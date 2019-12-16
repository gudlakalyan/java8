package com.karvy.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return new User(username,"$2y$12$1AxVIr1KK0Hhm2mptct2geQOp67WpoJ4kT/eU6ExaPF5vs63clXnO",new ArrayList<>());
		/*
		 * if("KARVYTECH".equals(username)) { // TODO Auto-generated method stub return
		 * new User("KARVYTECH",
		 * "$2y$12$1AxVIr1KK0Hhm2mptct2geQOp67WpoJ4kT/eU6ExaPF5vs63clXnO",new
		 * ArrayList<>()); }else { throw new
		 * UsernameNotFoundException("User not found with this token "); }
		 */
	}

}
