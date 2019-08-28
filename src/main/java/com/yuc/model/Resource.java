/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Resource
 * @version 1.0
 * @author
 */
public class Resource implements Serializable {

	// rid
	private Integer rid;
	// rname
	private String rname;
	// rattr
	private String rattr;
	// rarea
	private String rarea;
	// roprtime
	private String roprtime;
	// rsize
	private String rsize;
	// isdel
	private String isdel;
	// typeNum
	private String typeNum;
	// roprman
	private String roprman;
	// rcid
	private String rcid;

	private String sourceType;

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public void setRid(Integer value) {
		this.rid = value;
	}
	
	public Integer getRid() {
		return this.rid;
	}
	
	public void setRname(String value) {
		this.rname = value;
	}
	
	public String getRname() {
		return this.rname;
	}
	
	public void setRattr(String value) {
		this.rattr = value;
	}
	
	public String getRattr() {
		return this.rattr;
	}
	
	public void setRarea(String value) {
		this.rarea = value;
	}
	
	public String getRarea() {
		return this.rarea;
	}
	
	public void setRoprtime(String value) {
		this.roprtime = value;
	}
	
	public String getRoprtime() {
		return this.roprtime;
	}
	
	public void setRsize(String value) {
		this.rsize = value;
	}
	
	public String getRsize() {
		return this.rsize;
	}
	
	public void setIsdel(String value) {
		this.isdel = value;
	}
	
	public String getIsdel() {
		return this.isdel;
	}
	
	public void setTypeNum(String value) {
		this.typeNum = value;
	}
	
	public String getTypeNum() {
		return this.typeNum;
	}
	
	public void setRoprman(String value) {
		this.roprman = value;
	}
	
	public String getRoprman() {
		return this.roprman;
	}
	
	public void setRcid(String value) {
		this.rcid = value;
	}
	
	public String getRcid() {
		return this.rcid;
	}
	
}
