package net.guides.springboot.todomanagement.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.guides.springboot.todomanagement.model.User;
import net.guides.springboot.todomanagement.service.UserService;

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public String addUser(ModelMap model, @Valid User user, BindingResult result) {

		if (result.hasErrors()) {
			return "add-user";
		}
		//todo.setUserName("Priya Thoke");
		//todo.setUserName(getLoggedInUserName(model));
		userService.saveUser(user);
		return "redirect:/list-users";
	}
	
	/*
	 * @RequestMapping(value = "/list-users", method = RequestMethod.GET) public
	 * String showTodos(ModelMap model) { //String name =
	 * getLoggedInUserName(model); //String name = "Priya Thoke"; model.put("users",
	 * userService.getAllUsers()); return "list-users"; }
	 */

}
