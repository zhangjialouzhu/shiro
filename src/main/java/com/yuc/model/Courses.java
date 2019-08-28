/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.model;

import java.io.Serializable;

/**
 * Tcourses
 * @version 1.0
 * @author
 */
public class Courses implements Serializable {

	// id
	private String id;
	// cnname
	private String cnname;
	// engname
	private String engname;
	// majorId
	private String majorId;
		
	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setCnname(String value) {
		this.cnname = value;
	}
	
	public String getCnname() {
		return this.cnname;
	}
	
	public void setEngname(String value) {
		this.engname = value;
	}
	
	public String getEngname() {
		return this.engname;
	}
	
	public void setMajorId(String value) {
		this.majorId = value;
	}
	
	public String getMajorId() {
		return this.majorId;
	}
	
}
