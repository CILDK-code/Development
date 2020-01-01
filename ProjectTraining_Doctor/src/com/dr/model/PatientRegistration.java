package com.dr.model;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.dr.io.Insert;
import com.dr.io.Select;
import com.dr.io.Updata;
import com.dr.pojo.Doctor;
import com.dr.pojo.Patient;
import com.dr.util.StringUtil;
/**
 * ���߹Һ�
 * @author Administrator
 *
 */
public class PatientRegistration {
	public void PatientRegistrationModel(Patient patient) throws IOException {
		//�����Һ�ǰ���ҽ������
		Doctor doctorbf = null;
		Doctor doctoraf = null;
		//��ѯ�Һ�֮ǰ��ҽ����Ϣ
		String[] selectData = Select.selectData(patient.getDoctorName(),"D:/Doctor.txt");
		//����Ϣ��ΪList��Map����ʽ
		List<String> stringTranList = StringUtil.StringTranList(selectData[5]);
		for (String string : stringTranList) {
			System.out.println(string);
		}
		Map<String, String> stringTranMap = StringUtil.StringTranMap(selectData[7]);
		//�����Һ�ǰ���ҽ������
		doctorbf = new Doctor(selectData[1],selectData[3],stringTranList,stringTranMap);
		doctoraf = new Doctor(selectData[1],selectData[3],stringTranList,stringTranMap);
		//���µĻ��߹Һ���Ϣ��ӽ��Һź��ҽ��������
		doctoraf.setPatientList(patient);
		doctoraf.setMap(patient.getName(),patient.getIllinfo());
		System.out.println(doctoraf);
		System.out.println(doctoraf);
		//���øĲ���
		Updata.upDatainfo(doctorbf, doctoraf);
	}
}
