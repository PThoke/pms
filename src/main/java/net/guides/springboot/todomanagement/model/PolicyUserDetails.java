package net.guides.springboot.todomanagement.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import net.guides.springboot.todomanagement.model.User;

public class PolicyUserDetails implements UserDetails {
	private static final long serialVersionUID = 1L;
	private User user;
	
	public PolicyUserDetails(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ADMIN");
        return Arrays.asList(authority);
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	public String getFirstName() {
		return user.getFirstName();
	}
	
	public String getLastName() {
		return user.getLastName();
	}
	
	public String getGender() {
		return user.getGender();
	}
	public String getContact() {
		return user.getContact();
	}
	public Date getDob() {
		return user.getDob();
	}
	public int getUserId() {
		return user.getUserId();
	}
	
	public User getUser() {
		return user;
	}
}
