package com.al.ms;

import java.util.Random;

public class MS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] numbers = new int[30];
		for (int i =0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(1000);
		}
		int [] newnumbers = {10, 89, 43, 29, 36, 78, 54, 10, 210};
		System.out.println("Before");
		printArray(newnumbers);
		mergeSort(newnumbers);
		System.out.println("------------------");
		System.out.println("After");
		printArray(newnumbers);
	}

	private static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

	private static void mergeSort(int[] numbers) {
		// TODO Auto-generated method stub
		int inputlength = numbers.length;
		if (inputlength < 2) {
			return;
		}
		int midIndex = inputlength / 2;
		int[] leftArray = new int[midIndex];
		int[] rightArray = new int[inputlength - midIndex];
		
		for (int i = 0; i < midIndex; i++) {
			leftArray[i] = numbers[i];
		}
		for (int i = midIndex; i < inputlength; i++) {
			rightArray[i - midIndex] = numbers[i];
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		merge(numbers, leftArray, rightArray);
	}

	private static void merge(int[] numbers, int[] leftArray, int[] rightArray) {
		// TODO Auto-generated method stub
		int leftSize = leftArray.length;
		int rightSize = rightArray.length;
		int l = 0, r = 0, m = 0;
		while (l < leftSize && r < rightSize) {
			if (leftArray[l] < rightArray[r]) {
				numbers[m] = leftArray[l];
				l++;
			} else if (rightArray[r] < leftArray[l]) {
				numbers[m] = rightArray[r];
				r++;
			} else if(rightArray[r] == leftArray[l]) {
				numbers[m] = leftArray[l];
				numbers[m+1] = rightArray[r];
				r++;
				l++;
				m++;
			}
			m++;
		}
		if (l < leftSize) {
			numbers[m] = leftArray[l];
			m++;
			l++;
		}
		if (r < rightSize) {
			numbers[m] = rightArray[r];
			m++;
			r++;
		}
	}

}
