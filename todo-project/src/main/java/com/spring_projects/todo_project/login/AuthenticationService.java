package com.spring_projects.todo_project.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String name,String pass ) {
		return name.equalsIgnoreCase("vishnu")&&pass.equalsIgnoreCase("nichole");
	}
}
