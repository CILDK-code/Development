package com.dr.servlet;

import com.dr.model.PatientPayment;
/**
 * 获取处方信息调用方法
 * @author Administrator
 *
 */
public class PatientPaymentServlet {
	public void patientPaymentServlet(String prescription) {
		PatientPayment patientPayment = new PatientPayment();
		patientPayment.pay(prescription);
	}
}
