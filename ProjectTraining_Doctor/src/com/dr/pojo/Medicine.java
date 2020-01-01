package com.dr.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Medicine implements Serializable{
	//病情
	private String illinfo;
	//处方
	private String prescription;
	//处方及其对应的价格
	private Map<String, String> mapvalue = new HashMap<String, String>();
	//处方及其对应的病情
	private Map<String, String> mapinfo = new HashMap<String, String>();
	public Medicine() {
		
	}
	public String getIllinfo() {
		return illinfo;
	}
	public void setIllinfo(String illinfo) {
		this.illinfo = illinfo;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public Map<String, String> getMapvalue() {
		return mapvalue;
	}
	public void setMapvalue(String prescription , String value) {
		mapvalue.put(prescription, value);
	}
	public Map<String, String> getMapinfo() {
		return mapinfo;
	}
	public void setMapinfo(String illinfo , String prescription) {
		mapinfo.put(illinfo, prescription);
	}
	@Override
	public String toString() {
		return "illinfo:" + illinfo + ":prescription:" + prescription + ":mapvalue:" + mapvalue
				+ ":mapinfo:" + mapinfo ;
	}
	
}
