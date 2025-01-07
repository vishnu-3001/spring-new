package com.springboot_1.springboot_project_1;

public class Course {

	public int id;
	public String name;
	public String owner;
	public Course(int id,String name,String owner) {
		this.id=id;
		this.owner=owner;
		this.name=name;
	}
	public String tostring() {
		return "Course id is "+id+" and name is "+name+" owned by "+owner;
	}
}
