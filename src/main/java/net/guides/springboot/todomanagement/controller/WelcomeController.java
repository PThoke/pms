package net.guides.springboot.todomanagement.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.guides.springboot.todomanagement.model.PolicyUserDetails;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		//model.put("name", principal.getName());
		PolicyUserDetails userDetails = (PolicyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("loggedInUser", userDetails);
		model.addAttribute("page", "welcome");
		return "welcome";
	}

	/*
	 * private String getLoggedinUserName() { Object principal =
	 * SecurityContextHolder.getContext() .getAuthentication().getPrincipal();
	 * 
	 * if (principal instanceof UserDetails) { return ((UserDetails)
	 * principal).getUsername(); }
	 * 
	 * return principal.toString(); }
	 */

}
