package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

	private static void digitalLetterSortByAsc(String[] digitalLetterArr) {
		List<String> list = Arrays.asList(digitalLetterArr);
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		System.out.println("output:" + list.toString());
	}

	private static String getDigitalLetterStr(int[] digitalArr) {

		String msg = "";
		int size = digitalArr.length;

		if (digitalArr.length <= 0) {
			msg = "please input digital.";
		} else {
			if (digitalArr.length == 1) {
				msg = MyDigitalLetterEnum.getLetterFromDigital(digitalArr[0]).getLetter();
			} else {
				char[] first = MyDigitalLetterEnum.getLetterFromDigital(digitalArr[0]).getLetter().toCharArray();
				char[] next = null;

				for (int i = 1; i < size; i++) {
					next = MyDigitalLetterEnum.getLetterFromDigital(digitalArr[i]).getLetter().toCharArray();
					for (char f : first) {
						for (char n : next) {
							msg += f + "" + n + ",";
						}
					}
				}

				msg = msg.substring(0, msg.lastIndexOf(","));
				String[] digitalLetterArr = msg.split(",");
				digitalLetterSortByAsc(digitalLetterArr);
			}
		}

		return msg;
	}

	public static void main(String[] args) {
		int digitalArr[] = { 2, 5, 6 };
		getDigitalLetterStr(digitalArr);
	}

}
