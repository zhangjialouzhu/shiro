/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.model;

import java.io.Serializable;
import java.util.List;

/**
 * Tmajor
 * @version 1.0
 * @author
 */
public class Major implements Serializable {

	// id
	private String id;
	// engname
	private String engname;
	// cnname
	private String cnname;

	private List<Courses> courses;
		
	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setEngname(String value) {
		this.engname = value;
	}
	
	public String getEngname() {
		return this.engname;
	}
	
	public void setCnname(String value) {
		this.cnname = value;
	}
	
	public String getCnname() {
		return this.cnname;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
}
