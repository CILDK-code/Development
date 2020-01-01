package com.dr.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.dr.io.IOBaes;

public class Print {
	public static void PrintAll() throws IOException {
		IOBaes ioBaes = new IOBaes();
		int i = 0;
		List<String> list = new ArrayList<String>();
		List<String[]> listStr = new ArrayList<String[]>();
		try {
			list = ioBaes.informationInto("D:/Doctor.txt");
			listStr = StringUtil.StringDivision(list);
			for (int j = 0; j < listStr.size(); j++) {
				String[] string = listStr.get(j);
				if (string[5]!=null) {
					System.out.println(string[5]);
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
