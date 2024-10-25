package net.guides.springboot.todomanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.guides.springboot.todomanagement.model.PolicyUserDetails;
import net.guides.springboot.todomanagement.model.User;
import net.guides.springboot.todomanagement.service.UserService;

@Controller
public class NavigationController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		//model.put("name", getLoggedinUserName());
		System.out.println("Dashboard Page Loading");
		PolicyUserDetails userDetails = (PolicyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("currentPage", "dashboard");
		model.addAttribute("loggedInUser", userDetails);
		return "dashboard";
	}

	@RequestMapping(value = "/create-user", method = RequestMethod.GET)
	public String createUserPage(ModelMap model) {
		model.addAttribute("user", new User());
		System.out.println("Create User Page Loading");
		PolicyUserDetails userDetails = (PolicyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("loggedInUser", userDetails);
		return "create-user";
	}
	
	@RequestMapping(value = "/register-user", method = RequestMethod.GET)
	public String registerUser(ModelMap model) {
		model.addAttribute("user", new User());
		System.out.println("Register User Page Loading");
		return "create-user";
	}
	
	@RequestMapping(value = "/create-user", method = RequestMethod.POST)
	public String createUser(ModelMap model,@Valid User user, BindingResult result) {
		model.addAttribute("user", new User());
		System.out.println("Create User Page Loading");
		userService.saveUser(user);
		model.addAttribute("currentPage", "list-user");
		return "redirect:/list-user";
	}
	
	@RequestMapping(value = "/list-user", method = RequestMethod.GET)
	public String getAllUser(ModelMap model) {
		//model.put("name", getLoggedinUserName());
		model.addAttribute("users", userService.getAllUsers());
		PolicyUserDetails userDetails = (PolicyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("loggedInUser", userDetails);
		model.addAttribute("currentPage", "list-user");
		//return "create-user";
		return "list-users";
	}
}
