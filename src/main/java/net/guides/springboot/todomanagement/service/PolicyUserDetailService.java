package net.guides.springboot.todomanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import net.guides.springboot.todomanagement.model.PolicyUserDetails;
import net.guides.springboot.todomanagement.model.User;
import net.guides.springboot.todomanagement.repository.UserRepository;

public class PolicyUserDetailService implements UserDetailsService {
	@Autowired
    private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(emailId);
		if (user == null) {
			throw new UsernameNotFoundException("Could not find user with that email");
		}
		// TODO Auto-generated method stub
		return new PolicyUserDetails(user);
	}

}
