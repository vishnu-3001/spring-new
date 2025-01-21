package com.spring_projects.todo_project.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {
	public LoginController(AuthenticationService auth) {
		super();
		this.auth = auth;
	}
	private AuthenticationService auth;
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String Login() {
		return "login";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String redirectToWelcome(@RequestParam String name,@RequestParam String password,ModelMap map) {
		map.put("name",name);
		if(auth.authenticate(name, password)) {
		return "Welcome";
		}
			return "error-page";
	}
}
