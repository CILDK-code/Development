package com.qili.javabean;

public class User {
	private String name;
	private String grade;
	private String sex;
	private String studentId;

	public User() {
	}
	public User(String uname, String grade, String sex, String studentId) {
		this.name = name;
		this.grade = grade;
		this.sex = sex;
		this.studentId = studentId;
	}
	public String getUname() {
		return name;
	}
	public void setUname(String uname) {
		this.name = uname;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
}
