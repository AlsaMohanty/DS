package com.al.longestsubstr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FindLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxLength = 0;
		try {
			String input = br.readLine();
			Map<Character, Integer> record = new HashMap<>();
			for (int left =0, right = 0; right < input.length(); right++) {
				if (record.containsKey(input.charAt(right)) && record.get(input.charAt(right)) >= left) {
					left += record.get(input.charAt(right))+1 - left;
					System.out.println("Left is "+left);
				}
				record.put(input.charAt(right), right);
				maxLength = right - left + 1;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("MaximumLength is:");
		System.out.println(maxLength);
		
	}

}
