package com.dr.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * util工具类
 * @author Administrator
 *
 */
public class StringUtil {
	/**
	 * 对字符串进行分割
	 * @param list
	 * @return
	 */
	public static List<String[]> StringDivision(List<String> list) {
		List<String[]> listString = new ArrayList<String[]>();
		for (int i = 0; i < list.size() ; i++) {
			String[] split = list.get(i).split(":");
			listString.add(split);
		}
		return listString;
	}
	/**
	 * 把字符串中的信息转换成Map类型的形式
	 * @param string
	 * @return
	 */
	public static Map<String, String> StringTranMap(String string) {
		char[] charArray = string.toCharArray();
		Map<String, String> map = new HashMap<String, String>();
		String str = new String();
		for (int i = 0; i < charArray.length; i++) {
			if (!(charArray[i]>='a'&&charArray[i]<='z')) {
				charArray[i] = '!';
			}
		}
		for (int i = 0; i < charArray.length; i++) {
			str += charArray[i];
		}
		String[] split = str.split("!");
		for (int i = 0; i < split.length - 1; i++) {
			if (split[i].length()>0&&split[i+1].length()>0) {
				map.put(split[i], split[i+1]);
			}
		}
		return map;
	}
	/**
	 * 把字符串中信息转换成List类型的形式
	 * @param string
	 * @return
	 */
	public static List<String> StringTranList(String string) {
		
		char[] charArray = string.toCharArray();
		List<String> list = new ArrayList<String>();
		String str = new String();
//		System.out.println(string);
		for (int i = 0; i < charArray.length; i++) {
//			System.out.println("ok");
			if (!(charArray[i]>='a'&&charArray[i]<='z')) {
				charArray[i] = '!';
//				System.out.println(charArray[i]);
			}
		}
//		for (int i = 0; i < charArray.length; i++) {
//			System.out.println(charArray[i]);
//		}
		for (int i = 0; i < charArray.length; i++) {
//			if (charArray[i]!='!') {
//				str += charArray[i];
//			}
			str += charArray[i];
		}
		System.out.println(str);
		String[] split = str.split("!");
		for (int i = 0; i < split.length; i++) {
			System.out.println(i+"-->"+split[i]);
		}
		for (int i = 0; i < split.length ; i++) {
			if (split[i].length()>0) {
				list.add(split[i]);
			}
//			System.out.println(split[i]);
		}
//		list.add(str);

		for (String string2 : split) {
			System.out.println(string2);
		}
		for (String string2 : list) {
			System.out.println(string2);
		}
		System.out.println(list);
		return list;
	}
}
