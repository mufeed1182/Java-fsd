package com.ust.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.spring.entity.MyUser;
import com.ust.spring.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService  {

	@Autowired
	private UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> temp = ur.findById(username);
		MyUser u=null;
		if (temp.isPresent())
		{
			u=temp.get();
		}
		return u;
	}

}