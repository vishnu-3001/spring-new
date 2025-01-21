package com.spring_projects.todo_project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos=new ArrayList<>();
	static {
		todos.add(new Todo(1,"Vishnu","AWS",LocalDate.now(),false) );
		todos.add(new Todo(2,"Vishnu","Azure",LocalDate.now(),true) );
		todos.add(new Todo(3,"Bahubali","Yudham",LocalDate.now(),false) );

	}
	public List<Todo> findByUserName(String userName){
		return todos;
	}
}
