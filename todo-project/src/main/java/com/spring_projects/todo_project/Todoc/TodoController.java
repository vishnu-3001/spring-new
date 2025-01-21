package com.spring_projects.todo_project.Todoc;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spring_projects.todo_project.Todo;
import com.spring_projects.todo_project.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping(value="todoList")
	public String todoList(ModelMap model) {
		List<Todo>todos=todoService.findByUserName("vishnu");
		model.addAttribute("todos", todos);
		return "TodoDisplay";
	}
	
}
