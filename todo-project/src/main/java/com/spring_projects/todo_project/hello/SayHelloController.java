package com.spring_projects.todo_project.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! how are you today";
	}
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "hello";
	}

}
