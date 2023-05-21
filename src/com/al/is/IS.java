package com.al.is;

import java.util.Random;

public class IS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] numbers = new int[30];
		for (int i =0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(1000);
		}
		System.out.println("Before");
		printArray(numbers);
		insertionsort(numbers);
		System.out.println("------IS------------");
		System.out.println("After");
		printArray(numbers);
	}
	private static void insertionsort(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 1; i < numbers.length; i++) {
			int currentValue = numbers[i];
			
			int j = i -1;
			while (j >= 0 && numbers[j] > currentValue) {
				numbers[j+1] = numbers[j];
				j--;
			}
			numbers[j+1] = currentValue;
		}
	}
	private static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
