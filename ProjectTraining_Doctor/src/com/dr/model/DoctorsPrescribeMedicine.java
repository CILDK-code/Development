package com.dr.model;

import com.dr.io.Select;
import com.dr.pojo.Patient;
/**
 * 医生开药
 * @author Administrator
 *
 */
public class DoctorsPrescribeMedicine {
	public String Prescription(Patient patient) {
		//通过患者的病情信息查出处方
		String selectPrescription = Select.selectPrescription(patient.getIllinfo(),"D:/Medicine.txt");
		//把处方返回
		return selectPrescription;
	}
}
