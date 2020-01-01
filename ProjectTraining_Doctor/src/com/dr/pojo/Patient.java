package com.dr.pojo;

import java.io.Serializable;

public class Patient implements Serializable{
	//患者编号
	private int id;
	//患者姓名
	private String name;
	//患者年龄
	private int age;
	//要挂号的科室
	private String Departments;
	//要挂号的医生姓名
	private String doctorName;
	//病情信息
	private String illinfo;
	public Patient() {

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartments() {
		return Departments;
	}
	public void setDepartments(String departments) {
		Departments = departments;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getIllinfo() {
		return illinfo;
	}
	public void setIllinfo(String illinfo) {
		this.illinfo = illinfo;
	}
	@Override
	public String toString() {
		return "id:" + id + ":name:" + name + ":age:" + age + ":Departments:" + Departments
				+ ":doctorName:" + doctorName + ":illinfo:" + illinfo ;
	}
	
	
}
