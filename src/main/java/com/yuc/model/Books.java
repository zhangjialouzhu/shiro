/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Books
 * @version 1.0
 * @author
 */
public class Books implements Serializable {

	// bookId
	private String bookId;
	// bookName
	private String bookName;
	// bookArea
	private String bookArea;
	// bookSize
	private String bookSize;
	// bookOprtime
	private String bookOprtime;
	// isdel
	private String isdel;
	// typeNum
	private String typeNum;
	// bookAttr
	private String bookAttr;
	// bookOprman
	private String bookOprman;
		
	public void setBookId(String value) {
		this.bookId = value;
	}
	
	public String getBookId() {
		return this.bookId;
	}
	
	public void setBookName(String value) {
		this.bookName = value;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public void setBookArea(String value) {
		this.bookArea = value;
	}
	
	public String getBookArea() {
		return this.bookArea;
	}
	
	public void setBookSize(String value) {
		this.bookSize = value;
	}
	
	public String getBookSize() {
		return this.bookSize;
	}
	
	public void setBookOprtime(String value) {
		this.bookOprtime = value;
	}
	
	public String getBookOprtime() {
		return this.bookOprtime;
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
	
	public void setBookAttr(String value) {
		this.bookAttr = value;
	}
	
	public String getBookAttr() {
		return this.bookAttr;
	}
	
	public void setBookOprman(String value) {
		this.bookOprman = value;
	}
	
	public String getBookOprman() {
		return this.bookOprman;
	}
	
}
