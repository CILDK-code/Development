package com.dr.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dr.util.StringUtil;


/**
 * 查操作
 * @author Administrator
 *
 */
public class Select {
	/**
	 * 通过给定的name和url地址找到对应文件中的内容
	 * 可能有bug，建议更改后使用
	 * @param name
	 * @param url
	 * @return
	 */
	public static String[] selectData(String name,String url) {
		IOBaes ioBaes = new IOBaes();
		int i = 0;
		List<String> list = new ArrayList<String>();
		List<String[]> listStr = new ArrayList<String[]>();
		try {
			list = ioBaes.informationInto(url);
			System.out.println(list);
			listStr = StringUtil.StringDivision(list);
			for (i = 0; i < listStr.size() ; i++) {
				String[] str = listStr.get(i);
				if (str[1].equals(name)) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listStr.get(i);
	}
	/**
	 * 通过给定的url查询哪个医生的挂号表中有这个患者
	 * @param name
	 * @param url
	 * @return
	 */
	public static String[] selectPatientInfo(String name,String url) {
		IOBaes ioBaes = new IOBaes();
		int i = 0;
		List<String> list = new ArrayList<String>();
		List<String[]> listStr = new ArrayList<String[]>();
		try {
			list = ioBaes.informationInto(url);
			listStr = StringUtil.StringDivision(list);
			for (i = 0; i < listStr.size() ; i++) {
				String[] str = listStr.get(i);
				List<String> stringTranList = StringUtil.StringTranList(str[5]);
				for (int j = 0; j < str.length; j++) {
					if (stringTranList.get(j).equals(name)) {
						break;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listStr.get(i);
	}
	/**
	 * 通过病情和给定的url查询对应处方
	 * 可能有bug，虽然已经改了一次
	 * @param illinfo
	 * @param url
	 * @return
	 */
	public static String selectPrescription(String illinfo,String url) {
		IOBaes ioBaes = new IOBaes();
		String string = null;
		int i = 0;
		List<String> list = new ArrayList<String>();
		List<String[]> listStr = new ArrayList<String[]>();
		try {
			list = ioBaes.informationInto(url);
			listStr = StringUtil.StringDivision(list);
			
			for (i = 0; i < listStr.size() ; i++) {
				String[] str = listStr.get(i);
				Map<String, String> stringTranMap = StringUtil.StringTranMap(str[7]);
				if ((string = stringTranMap.get(illinfo))!=null) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return string;
	}
	/**
	 * 查询处方对应的价格
	 * @param prescription
	 * @param url
	 * @return
	 */
	public static String selectValue(String prescription, String url) {
		IOBaes ioBaes = new IOBaes();
		String string = null;
		int i = 0;
		List<String> list = new ArrayList<String>();
		List<String[]> listStr = new ArrayList<String[]>();
		try {
			list = ioBaes.informationInto(url);
			listStr = StringUtil.StringDivision(list);
			
			for (i = 0; i < listStr.size() ; i++) {
				String[] str = listStr.get(i);
				Map<String, String> stringTranMap = StringUtil.StringTranMap(str[5]);
				if ((string = stringTranMap.get(prescription))!=null) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return string;
	}
	}

