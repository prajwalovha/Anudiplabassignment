package com.example;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Teacher {
	@Id
	private int T_id;
	private String T_name;
	
	public Teacher() {
		
		// TODO Auto-generated constructor stub
	}

	public int getT_id() {
		return T_id;
	}

	public void setT_id(int t_id) {
		T_id = t_id;
	}

	public String getT_name() {
		return T_name;
	}

	public void setT_name(String t_name) {
		T_name = t_name;
	}


	@OneToMany(cascade=CascadeType.ALL)
	List<Courses> Courses;

	public List<Courses> getCourses() {
		return Courses;
	}

	public void setCourses(List<Courses> courses) {
		Courses = courses;
	}

}
