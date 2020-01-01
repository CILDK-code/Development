package com.dr.test;

import java.io.IOException;

import com.dr.io.IOBaes;
import com.dr.io.Insert;
import com.dr.model.PatientRegistration;
import com.dr.pojo.Doctor;
import com.dr.pojo.Medicine;
import com.dr.servlet.DoctorPrescribeMedicineServlet;
import com.dr.servlet.PatientRegistrationServlet;
import com.dr.util.Print;

public class Test {
	public static void main(String[] args) throws IOException {
//		PatientRegistrationServlet prs = new PatientRegistrationServlet();
//		prs.patientRegistrationServlet(1, "ww", 33, "ear", "l1", "hennanshou");
//		DoctorPrescribeMedicineServlet dpm = new DoctorPrescribeMedicineServlet();
//		String doctorPrescribeMedicineServlet = dpm.doctorPrescribeMedicineServlet(1, "ls", 33, "ear", "l1", "nanshou");
//		System.out.println(doctorPrescribeMedicineServlet);
		Medicine medicine1 = new Medicine();
		medicine1.setMapinfo("nanshou", "medicineofear");
		Medicine medicine2 = new Medicine();
		medicine2.setMapinfo("hannanshou", "bigmedicineofear");
		Insert.insertData(medicine1);
		Insert.insertData(medicine2);
//		Print.PrintAll();
//		Doctor doctor1 = new Doctor();
//		doctor1.setName("l1");
//		Doctor doctor2 = new Doctor();
//		doctor2.setName("l2");
//		Doctor doctor3 = new Doctor();
//		doctor3.setName("l3");
//		Doctor doctor4 = new Doctor();
//		doctor4.setName("l4");
//		Doctor doctor5 = new Doctor();
//		doctor5.setName("l5");
//		try {
//			Insert.insertData(doctor1);
//			Insert.insertData(doctor2);
//			Insert.insertData(doctor3);
//			Insert.insertData(doctor4);
//			Insert.insertData(doctor5);
////			System.out.println(doctor1);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		IOBaes ioBaes = new IOBaes();
//		Doctor doctor2 = new Doctor();
//		doctor2.setName("l2");
//		Insert.insertData(doctor2);
//		ioBaes.informationOutPut();
	}
//	static {
//		Doctor doctor1 = new Doctor();
//		doctor1.setName("l11");
//		Doctor doctor2 = new Doctor();
//		doctor1.setName("l2");
//		Doctor doctor3 = new Doctor();
//		doctor1.setName("l3");
//		Doctor doctor4 = new Doctor();
//		doctor1.setName("l4");
//		Doctor doctor5 = new Doctor();
//		doctor1.setName("l5");
//		try {
//			Insert.insertData(doctor1);
//			Insert.insertData(doctor2);
//			Insert.insertData(doctor3);
//			Insert.insertData(doctor4);
//			Insert.insertData(doctor5);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
