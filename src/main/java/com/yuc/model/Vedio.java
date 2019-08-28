/*
 * Copyright(c) 2016 cncounter.com All rights reserved.
 * distributed with this file and available online at
 * http://www.cncounter.com/
 */
package com.yuc.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Vedio
 * @version 1.0
 * @author
 */
public class Vedio implements Serializable {

	// vedioId
	private Integer vedioId;
	// vedioName
	private String vedioName;
	// vedioAttr
	private String vedioAttr;
	// vedioArea
	private String vedioArea;
	// vedioOprtime
	private String vedioOprtime;
	// vedioSize
	private String vedioSize;
	// isdel
	private String isdel;
	// typeNum
	private String typeNum;
	// vedioOprman
	private String vedioOprman;
		
	public void setVedioId(Integer value) {
		this.vedioId = value;
	}
	
	public Integer getVedioId() {
		return this.vedioId;
	}
	
	public void setVedioName(String value) {
		this.vedioName = value;
	}
	
	public String getVedioName() {
		return this.vedioName;
	}
	
	public void setVedioAttr(String value) {
		this.vedioAttr = value;
	}
	
	public String getVedioAttr() {
		return this.vedioAttr;
	}
	
	public void setVedioArea(String value) {
		this.vedioArea = value;
	}
	
	public String getVedioArea() {
		return this.vedioArea;
	}
	
	public void setVedioOprtime(String value) {
		this.vedioOprtime = value;
	}
	
	public String getVedioOprtime() {
		return this.vedioOprtime;
	}
	
	public void setVedioSize(String value) {
		this.vedioSize = value;
	}
	
	public String getVedioSize() {
		return this.vedioSize;
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
	
	public void setVedioOprman(String value) {
		this.vedioOprman = value;
	}
	
	public String getVedioOprman() {
		return this.vedioOprman;
	}
	
}
