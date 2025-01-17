package com.spring_projects.todo_project.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping("login")
	public String Login(@RequestParam String name,ModelMap model) {
		model.put("name", name);
		System.out.println(name);
		return "login";
	}
}
