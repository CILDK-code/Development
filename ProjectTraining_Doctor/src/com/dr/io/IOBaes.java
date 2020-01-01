package com.dr.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.dr.pojo.Doctor;
import com.dr.pojo.Medicine;
import com.dr.pojo.Patient;
/**
 * io基础部分
 * @author Administrator
 *
 */
public class IOBaes {
	public void informationOutPut(Medicine medicine, String string) throws IOException {
		File file = new File(string);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
		fw = new FileWriter(file,true);
		bw = new BufferedWriter(fw);
		bw.write(medicine.toString());
		bw.newLine();
		bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fw!=null) {
				fw.close();
			}
		}
	}
	public void informationOutPut(Doctor doctor, String string) throws IOException {
		File file = new File(string);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
		fw = new FileWriter(file,true);
		bw = new BufferedWriter(fw);
		bw.write(doctor.toString());
		bw.newLine();
		bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fw!=null) {
				fw.close();
			}
		}
	}
	public void informationOutPut() throws IOException {
		File file = new File("D:/Doctor.txt");
		FileWriter fw = null;
		Doctor d1 = new Doctor("l1", "", null, null);
		try {
		fw = new FileWriter(file,true);
		fw.write(d1.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fw!=null) {
				fw.close();
			}
		}
	}
	public List<String> informationInto(String string) throws IOException {
		File file = new File(string);
		int i =0;
		List<String> list = new ArrayList<String>();
		FileReader fr = null;
		BufferedReader bfr = null;
		StringBuffer sBuffer = new StringBuffer();
		try {
			fr = new FileReader(file);
			bfr = new BufferedReader(fr);
			//i = bfr.read()会读取第一个字符
			while((i = bfr.read())!=-1) {
				char a = (char) i;
				list.add(a+bfr.readLine());
			}
			bfr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fr!=null) {
				fr.close();
			}
		}
		return list;
	}
	public void ListOutPut(List<String> list,String string) throws IOException {
		File file = new File(string);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
		fw = new FileWriter(file);
		bw = new BufferedWriter(fw);
		for (String string2 : list) {
			bw.write(string2);
			bw.newLine();
		}
		bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fw!=null) {
				fw.close();
			}
		}
	}
}
