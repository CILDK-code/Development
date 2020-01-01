package com.dr.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.dr.pojo.Doctor;
import com.dr.pojo.Patient;
import com.dr.util.StringUtil;
/**
 * ɾ����
 * @author Administrator
 *
 */
public class Delect {
	/**
	 * ɾ��������Ϣ
	 * ���Ƽ�֮��ʹ�ã�������bug
	 * @param patient
	 */
	public static void delectData(Patient patient) {
		IOBaes ioBaes = new IOBaes();
		List<String> list = new ArrayList<String>();
		List<String[]> listStr = new ArrayList<String[]>();
		try {
			list = ioBaes.informationInto("D:/Patient.txt");
			listStr = StringUtil.StringDivision(list);
			for (int i = 0; i < listStr.size() ; i++) {
				String[] str = listStr.get(i);
				if (str[1].equals(patient.getId())) {
					list.remove(i);
				}
			}
			ioBaes.ListOutPut(list, "D:/Patient.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * ɾ��ҽ������Ϣ
	 * @param doctor
	 */
	public static void delectData(Doctor doctor) {
		IOBaes ioBaes = new IOBaes();
		List<String> list = new ArrayList<String>();
		List<String[]> listStr = new ArrayList<String[]>();
		try {
			list = ioBaes.informationInto("D:/Doctor.txt");
			listStr = StringUtil.StringDivision(list);
			for (int i = 0; i < listStr.size() ; i++) {
				String[] str = listStr.get(i);
				if (str[1].equals(doctor.getName())) {
					list.remove(i);
				}
			}
			ioBaes.ListOutPut(list, "D:/Doctor.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
