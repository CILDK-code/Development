package com.dr.model;

import java.util.Map;

import com.dr.io.Select;
import com.dr.util.StringUtil;
/**
 * 患者缴费
 * @author Administrator
 *
 */
public class PatientPayment {
	public void pay(String prescription) {
		//通过处方信息查出对应的价格
		String selectValue = Select.selectValue(prescription,"D:/Medicine.txt");
		System.out.println("缴费"+selectValue);
	}
}
