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
 * 患者挂号
 * @author Administrator
 *
 */
public class PatientRegistration {
	public void PatientRegistrationModel(Patient patient) throws IOException {
		//创建挂号前后的医生对象
		Doctor doctorbf = null;
		Doctor doctoraf = null;
		//查询挂号之前的医生信息
		String[] selectData = Select.selectData(patient.getDoctorName(),"D:/Doctor.txt");
		//将信息改为List和Map的形式
		List<String> stringTranList = StringUtil.StringTranList(selectData[5]);
		for (String string : stringTranList) {
			System.out.println(string);
		}
		Map<String, String> stringTranMap = StringUtil.StringTranMap(selectData[7]);
		//构建挂号前后的医生对象
		doctorbf = new Doctor(selectData[1],selectData[3],stringTranList,stringTranMap);
		doctoraf = new Doctor(selectData[1],selectData[3],stringTranList,stringTranMap);
		//把新的患者挂号信息添加进挂号后的医生对象中
		doctoraf.setPatientList(patient);
		doctoraf.setMap(patient.getName(),patient.getIllinfo());
		System.out.println(doctoraf);
		System.out.println(doctoraf);
		//调用改操作
		Updata.upDatainfo(doctorbf, doctoraf);
	}
}
