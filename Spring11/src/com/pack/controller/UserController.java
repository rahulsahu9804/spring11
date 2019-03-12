package com.pack.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.pack.model.User;
import com.pack.service.UserService;

public class UserController extends SimpleFormController{
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public UserController() {
		super();
		
		setCommandClass(User.class);
		
		setCommandName("user");
		// TODO Auto-generated constructor stub
	}
	protected ModelAndView onSubmit(Object command) throws Exception{
		User u=(User)command;
		userService.add(u);
		
		return new ModelAndView("userSuccess","user",u);
	}
}
