package com.al.stringuppercase;

import java.util.Scanner;

public class CheckStringValidity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Insert word:");
		String input = inputScan.next();
		boolean res = checkStringValidity(input);
		System.out.println(res);
	}

	private static boolean checkStringValidity(String input) {
		// TODO Auto-generated method stub
		int strLength = input.length();
		int count = 0;
		for (int i = 0; i < strLength; i++) {
			if (Character.isUpperCase(input.charAt(i))) {
				count++;
			}
		}
		if (count == 0 || count == strLength) {
			return true;
		} else if (count == 1) {
			if (Character.isUpperCase(input.charAt(0))) {
				return true;
			}
		}
		return false;
	}

}
