package com.al.bs;

import java.util.Random;

public class BS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] numbers = new int[30];
		for (int i =0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(1000);
		}
		System.out.println("Before");
		printArray(numbers);
		bubbleSort(numbers);
		System.out.println("-------BS-----------");
		System.out.println("After");
		printArray(numbers);
	}

	private static void bubbleSort(int[] numbers) {
		// TODO Auto-generated method stub
		boolean swapRequired = true;
		while(swapRequired) {
			swapRequired = false;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i+1]) {
					swapRequired = true;
					int temp  = numbers[i];
					numbers[i]=numbers[i+1];
					numbers[i+1] = temp;
				}
			}
		}
	}

	private static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
