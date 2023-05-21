package com.al.qs;

import java.util.Random;

public class QS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] numbers = new int[30];
		for (int i =0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(1000);
		}
		System.out.println("Before");
		printArray(numbers);
		quicksort(numbers, 0, numbers.length-1);
		System.out.println("---------QuickSort---------");
		System.out.println("After");
		printArray(numbers);
	}
	
	private static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	private static void quicksort(int []numbers, int lowIdx, int highIdx) {
		if (lowIdx >= highIdx) {
			return;
		}
		int pivot = numbers[highIdx];
		int l = lowIdx;
		int r = highIdx;
		while(l < r) {
			while (numbers[l] <= pivot && l < r) {
				l++;
			}
			while (numbers[r] >= pivot && r > l) {
				r--;
			}
			swap (numbers, l, r);
		}
		swap(numbers, l, highIdx);
		quicksort(numbers, lowIdx, l-1);
		quicksort(numbers, r+1, highIdx);
	}
	
	private static void swap(int []numbers, int idxOne, int idxTwo) {
		int temp = numbers[idxOne];
		numbers[idxOne] = numbers[idxTwo];
		numbers[idxTwo] = temp;
	}
}
