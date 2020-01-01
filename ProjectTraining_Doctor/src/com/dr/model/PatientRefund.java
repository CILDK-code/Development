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
 * 患者退号
 * @author Administrator
 *
 */
public class PatientRefund {
	public void Refund(Patient patient) throws IOException {
		Doctor doctor = null;
		//查出哪个医生有这个患者
		String[] selectData = Select.selectPatientInfo(patient.getName(),"D:/Doctor.txt");
		List<String> stringTranList = StringUtil.StringTranList(selectData[5]);
		Map<String, String> stringTranMap = StringUtil.StringTranMap(selectData[7]);
		//把患者的信息去除
		for (int i = 0; i < stringTranList.size(); i++) {
			if (stringTranList.get(i).equals(patient.getName())) {
				stringTranList.remove(i);
			}
		}
		String string = stringTranMap.get(patient.getName());
		stringTranMap.remove(patient.getName(), string);
		//创建医生对象
		doctor = new Doctor(selectData[1],selectData[3],stringTranList,stringTranMap);
		//先把医生信息删除
		Delect.delectData(doctor);
		//把医生信息重新添加
		Insert.insertData(doctor);
	}
}
