package com.dr.io;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dr.util.StringUtil;


/**
 * �����
 * @author Administrator
 *
 */
public class Select {
	/**
	 * ͨ��������name��url��ַ�ҵ���Ӧ�ļ��е�����
	 * ������bug��������ĺ�ʹ��
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
	 * ͨ��������url��ѯ�ĸ�ҽ���ĹҺű������������
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
	 * ͨ������͸�����url��ѯ��Ӧ����
	 * ������bug����Ȼ�Ѿ�����һ��
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
	 * ��ѯ������Ӧ�ļ۸�
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

