package com.dr.servlet;

import com.dr.model.DoctorsPrescribeMedicine;
import com.dr.pojo.Patient;
/**
 * ��ȡ��Ϣ�������߶�����÷���
 * @author Administrator
 *
 */
public class DoctorPrescribeMedicineServlet {
	public String doctorPrescribeMedicineServlet(int id,String name,int age,String Departments,String doctorName,String illinfo) {
		DoctorsPrescribeMedicine doctorsPrescribeMedicine = new DoctorsPrescribeMedicine();
		Patient patient = new Patient();
		patient.setId(id);
		patient.setName(name);
		patient.setAge(age);
		patient.setDepartments(Departments);
		patient.setDoctorName(doctorName);
		patient.setIllinfo(illinfo);
		String prescription = doctorsPrescribeMedicine.Prescription(patient);
		return prescription;
	}
}
