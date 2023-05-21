package com.al.brackets;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BracketCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		System.out.println("User Input is "+userInput);
		List<String> combinations = new LinkedList<>();
		findCombinations("", 0, 0, combinations, userInput);
		for (String e: combinations) {
			System.out.println(e);
		}
	}

	private static void findCombinations(String string, int openPara, int closedPara, List<String> combinations, int userInput) {
		// TODO Auto-generated method stub
		if (string.length() == 2*userInput) {
			combinations.add(string);
		}
		if (openPara < userInput) {
			findCombinations(string+"(", openPara+1, closedPara, combinations, userInput);
//			openPara++;
		}
		if (closedPara  < openPara) {
			findCombinations(string+")", openPara, closedPara+1, combinations, userInput);
//			closedPara++;
		}
	}

}
