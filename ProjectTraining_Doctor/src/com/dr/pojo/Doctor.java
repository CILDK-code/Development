package com.dr.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Doctor implements Serializable{
	//医生姓名
	private String name;
	//医生所在科室
	private String Departments;
	//患者挂号列表
	private List<String> patientList = new ArrayList<String>(); 
	//患者姓名及对应的病情
	private Map<String, String>map = new HashMap<String, String>();
	
	public Doctor() {

	}
	
	public Doctor(String name, String departments, List<String> patientList, Map<String, String> map) {
		this.name = name;
		Departments = departments;
		this.patientList = patientList;
		this.map = map;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartments() {
		return Departments;
	}
	public void setDepartments(String departments) {
		Departments = departments;
	}
	public ArrayList<String> getPatientList() {
		return (ArrayList<String>) patientList;
	}
	public void setPatientList(Patient patient) {
		patientList.add(patient.getName());
	}
	public HashMap<String, String> getMap() {
		return (HashMap<String, String>) map;
	}
	public void setMap(String string1,String string2) {
		map.put(string1, string2);
	}
	@Override
	public String toString() {
		return "name:" + name + ":Departments:" + Departments + ":patientList:" + patientList + ":map:" + map ;
	}
	
}
