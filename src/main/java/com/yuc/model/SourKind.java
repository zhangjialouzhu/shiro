/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * SourKind
 * @version 1.0
 * @author
 */
public class SourKind implements Serializable {

	// id
	private String id;
	// sourceNum
	private String sourceNum;
	// sourceType
	private String sourceType;
		
	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setSourceNum(String value) {
		this.sourceNum = value;
	}
	
	public String getSourceNum() {
		return this.sourceNum;
	}
	
	public void setSourceType(String value) {
		this.sourceType = value;
	}
	
	public String getSourceType() {
		return this.sourceType;
	}
	
}
