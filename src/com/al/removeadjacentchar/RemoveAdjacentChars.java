package com.al.removeadjacentchar;

import java.util.Scanner;

public class RemoveAdjacentChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		removeAdjacentCommonChars(userInput);
	}

	private static void removeAdjacentCommonChars(String userInput) {
		// TODO Auto-generated method stub
		char []result = new char[userInput.length()];
		int resIndex = 0;
		for (int charIndex = 0; charIndex<userInput.length(); charIndex++) {
			char currentChar = userInput.charAt(charIndex);
			if(resIndex > 0 && result[resIndex - 1] == currentChar) {
				resIndex--;
			} else {
				result[resIndex] = currentChar;
				resIndex++;
			}
		}
		String res= new String(result, 0, resIndex);
		System.out.println("Result:"+ res);
	}

}
