package com.dr.pojo;

import java.io.Serializable;

public class Patient implements Serializable{
	//���߱��
	private int id;
	//��������
	private String name;
	//��������
	private int age;
	//Ҫ�ҺŵĿ���
	private String Departments;
	//Ҫ�Һŵ�ҽ������
	private String doctorName;
	//������Ϣ
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
