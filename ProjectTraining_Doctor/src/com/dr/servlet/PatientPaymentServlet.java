package com.dr.servlet;

import com.dr.model.PatientPayment;
/**
 * ��ȡ������Ϣ���÷���
 * @author Administrator
 *
 */
public class PatientPaymentServlet {
	public void patientPaymentServlet(String prescription) {
		PatientPayment patientPayment = new PatientPayment();
		patientPayment.pay(prescription);
	}
}
