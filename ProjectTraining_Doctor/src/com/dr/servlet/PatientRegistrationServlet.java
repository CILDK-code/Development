package com.dr.servlet;

import java.io.IOException;

import com.dr.model.PatientRegistration;
import com.dr.pojo.Patient;
/**
 * 创建患者对象，调用方法
 * @author Administrator
 *
 */
public class PatientRegistrationServlet {
	public void patientRegistrationServlet(int id,String name,int age,String Departments,String doctorName,String illinfo) throws IOException {
		PatientRegistration patientRegistration = new PatientRegistration();
		Patient patient = new Patient();
		patient.setId(id);
		patient.setName(name);
		patient.setAge(age);
		patient.setDepartments(Departments);
		patient.setDoctorName(doctorName);
		patient.setIllinfo(illinfo);
		patientRegistration.PatientRegistrationModel(patient);
	}
}
