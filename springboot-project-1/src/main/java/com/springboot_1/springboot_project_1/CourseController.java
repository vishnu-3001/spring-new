package com.springboot_1.springboot_project_1;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		return Arrays.asList(
				new Course(1,"AWS","Amazon"),
				new Course(2,"LLM","Open AI"),
				new Course(3,"React","Meta")
		);
	}
}
