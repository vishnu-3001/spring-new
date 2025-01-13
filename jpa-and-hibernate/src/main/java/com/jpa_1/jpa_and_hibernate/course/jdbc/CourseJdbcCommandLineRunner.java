package com.jpa_1.jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa_1.jpa_and_hibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
	@Autowired
	private CourseJPARepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"AWS","Amazon"));
		repository.insert(new Course(2,"Azure","Microsoft"));
		repository.insert(new Course(3,"Llama","Meta"));

		repository.deleteById(1);
		System.out.println(repository.findById(2));
		
	}

}
