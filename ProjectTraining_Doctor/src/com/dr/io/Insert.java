package com.dr.io;

import java.io.IOException;

import com.dr.pojo.Doctor;
import com.dr.pojo.Medicine;
/**
 * ������
 * @author Administrator
 *
 */
public class Insert {
	/**
	 * ���ļ������ҽ����Ϣ
	 * @param doctor
	 * @throws IOException
	 */
	public static void insertData(Doctor doctor) throws IOException {
		IOBaes ioBaes = new IOBaes();
		ioBaes.informationOutPut(doctor, "D:/Doctor.txt");
	}
	public static void insertData(Medicine medicine) throws IOException {
		IOBaes ioBaes = new IOBaes();
		ioBaes.informationOutPut(medicine, "D:/Medicine.txt");
	}
}
