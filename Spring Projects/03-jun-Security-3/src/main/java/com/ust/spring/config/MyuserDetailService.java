package com.ust.spring.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ust.spring.entity.MyUser;
import com.ust.spring.repository.UserRepository;

@Service
public class MyuserDetailService implements UserDetailsService {
	
	@Autowired
	private UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<MyUser> temp = ur.findById(userName);
		MyUser u=null;
		if(temp!=null)
		{
			u=temp.get();
		}
		return u;
	}

}
