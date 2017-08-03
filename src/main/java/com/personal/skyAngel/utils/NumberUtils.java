package com.personal.skyAngel.utils;

public class NumberUtils {

	/**
	 * 生成一个长度为18的全数字字符串
	 *
	 * @return
	 */
	public static String generateNumber() {
		long first = System.currentTimeMillis();
		double second = Math.random() * 100000;
		StringBuffer number = new StringBuffer();
		number.append(String.valueOf(first));
		number.append(String.valueOf(second));
		return number.toString().substring(0, 18);

	}
}
