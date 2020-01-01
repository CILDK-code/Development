package com.dr.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import com.dr.pojo.Doctor;
import com.dr.util.StringUtil;
/**
 * 改操作
 * @author Administrator
 *
 */
public class Updata {
	/**
	 * 把doctorin的内容改为doctorout的
	 * @param doctorin
	 * @param doctorout
	 */
	public static void upDatainfo(Doctor doctorin , Doctor doctorout) {
		IOBaes ioBaes = new IOBaes();
		List<String> list = new ArrayList<String>();
		List<String[]> listStr = new ArrayList<String[]>();
		try {
			list = ioBaes.informationInto("D:/Doctor.txt");
			listStr = StringUtil.StringDivision(list);
			for (int i = 0; i < listStr.size() ; i++) {
				String[] str = listStr.get(i);
				if (str[1].equals(doctorin.getName())) {
					list.remove(i);
					list.add(doctorout.toString());
				}
			}
//			for (int i = 0; i < listStr.size() ; i++) {
//				String[] str = listStr.get(i);
//				for (int j = 0; j < str.length; j++) {
//					System.out.println(str[j]);
//				}
//			}
			ioBaes.ListOutPut(list, "D:/Doctor.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
