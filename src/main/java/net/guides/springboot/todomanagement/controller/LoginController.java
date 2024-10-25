package net.guides.springboot.todomanagement.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.guides.springboot.todomanagement.model.Login;

@Controller
public class LoginController {

	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		model.put("login", new Login());
		System.out.println("Login page loading ");
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response, ModelMap model, @Valid Login loginUser, BindingResult result) throws ServletException, IOException {
		System.out.println("Login successfull !");
		//request.setAttribute("activePage", "welcome");
		model.addAttribute("currentPage", "welcome");
		return "redirect:/welcome";
	}
}
