package com.dr.pojo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Medicine implements Serializable{
	//����
	private String illinfo;
	//����
	private String prescription;
	//���������Ӧ�ļ۸�
	private Map<String, String> mapvalue = new HashMap<String, String>();
	//���������Ӧ�Ĳ���
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
