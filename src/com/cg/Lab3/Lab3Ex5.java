package com.cg.Lab3;

public class Lab3Ex5 {

	public static void main(String[] args) {

		int number1 = 42569874;
		System.out.println(number1);
		System.out.println(Lab3Ex5.modifyNumber(number1));

	}

	public static int modifyNumber(int number1) {

		String temp = Integer.toString(number1);
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < temp.length() - 1; i++) {
			int num = temp.charAt(i) - temp.charAt(i + 1);
			result.append(Math.abs(num));
		}
		result.append(temp.charAt(temp.length() - 1));
		return Integer.parseInt(result.toString());
	}

}

