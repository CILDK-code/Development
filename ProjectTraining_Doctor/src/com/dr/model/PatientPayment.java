package com.dr.model;

import java.util.Map;

import com.dr.io.Select;
import com.dr.util.StringUtil;
/**
 * ���߽ɷ�
 * @author Administrator
 *
 */
public class PatientPayment {
	public void pay(String prescription) {
		//ͨ��������Ϣ�����Ӧ�ļ۸�
		String selectValue = Select.selectValue(prescription,"D:/Medicine.txt");
		System.out.println("�ɷ�"+selectValue);
	}
}
