/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Doc
 * @version 1.0
 * @author
 */
public class Doc implements Serializable {

	// docId
	private String docId;
	// docName
	private String docName;
	// docArea
	private String docArea;
	// docTime
	private String docTime;
	// docOprman
	private String docOprman;
	// isdel
	private String isdel;
	// docAttr
	private String docAttr;
	// typeNum
	private String typeNum;
		
	public void setDocId(String value) {
		this.docId = value;
	}
	
	public String getDocId() {
		return this.docId;
	}
	
	public void setDocName(String value) {
		this.docName = value;
	}
	
	public String getDocName() {
		return this.docName;
	}
	
	public void setDocArea(String value) {
		this.docArea = value;
	}
	
	public String getDocArea() {
		return this.docArea;
	}
	
	public void setDocTime(String value) {
		this.docTime = value;
	}
	
	public String getDocTime() {
		return this.docTime;
	}
	
	public void setDocOprman(String value) {
		this.docOprman = value;
	}
	
	public String getDocOprman() {
		return this.docOprman;
	}
	
	public void setIsdel(String value) {
		this.isdel = value;
	}
	
	public String getIsdel() {
		return this.isdel;
	}
	
	public void setDocAttr(String value) {
		this.docAttr = value;
	}
	
	public String getDocAttr() {
		return this.docAttr;
	}
	
	public void setTypeNum(String value) {
		this.typeNum = value;
	}
	
	public String getTypeNum() {
		return this.typeNum;
	}
	
}
