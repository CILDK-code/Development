package com.dr.model;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.dr.io.Delect;
import com.dr.io.Insert;
import com.dr.io.Select;
import com.dr.pojo.Doctor;
import com.dr.pojo.Patient;
import com.dr.util.StringUtil;
/**
 * �����˺�
 * @author Administrator
 *
 */
public class PatientRefund {
	public void Refund(Patient patient) throws IOException {
		Doctor doctor = null;
		//����ĸ�ҽ�����������
		String[] selectData = Select.selectPatientInfo(patient.getName(),"D:/Doctor.txt");
		List<String> stringTranList = StringUtil.StringTranList(selectData[5]);
		Map<String, String> stringTranMap = StringUtil.StringTranMap(selectData[7]);
		//�ѻ��ߵ���Ϣȥ��
		for (int i = 0; i < stringTranList.size(); i++) {
			if (stringTranList.get(i).equals(patient.getName())) {
				stringTranList.remove(i);
			}
		}
		String string = stringTranMap.get(patient.getName());
		stringTranMap.remove(patient.getName(), string);
		//����ҽ������
		doctor = new Doctor(selectData[1],selectData[3],stringTranList,stringTranMap);
		//�Ȱ�ҽ����Ϣɾ��
		Delect.delectData(doctor);
		//��ҽ����Ϣ�������
		Insert.insertData(doctor);
	}
}
