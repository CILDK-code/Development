package com.dr.model;

import com.dr.io.Select;
import com.dr.pojo.Patient;
/**
 * ҽ����ҩ
 * @author Administrator
 *
 */
public class DoctorsPrescribeMedicine {
	public String Prescription(Patient patient) {
		//ͨ�����ߵĲ�����Ϣ�������
		String selectPrescription = Select.selectPrescription(patient.getIllinfo(),"D:/Medicine.txt");
		//�Ѵ�������
		return selectPrescription;
	}
}
