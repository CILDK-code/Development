package com.dr.servlet;

import java.io.IOException;

import com.dr.model.PatientRefund;
import com.dr.pojo.Patient;
/**
 * �������߶�����÷���
 * @author Administrator
 *
 */
public class PatientRefundServlet {
	public void patientRefundServlet(int id,String name,int age,String Departments,String doctorName,String illinfo) throws IOException {
		PatientRefund patientRefund = new PatientRefund();
		Patient patient = new Patient();
		patient.setId(id);
		patient.setName(name);
		patient.setAge(age);
		patient.setDepartments(Departments);
		patient.setDoctorName(doctorName);
		patient.setIllinfo(illinfo);
		patientRefund.Refund(patient);
	}
}
