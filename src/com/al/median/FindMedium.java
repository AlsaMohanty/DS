package com.al.median;

import java.util.Arrays;
import java.util.Random;

public class FindMedium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] arrayOne = new int[10];
		int[] arrayTwo = new int[21];
		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = rand.nextInt(500);
		}
		for (int i = 0; i < arrayTwo.length; i++) {
			arrayTwo[i] = rand.nextInt(700);
		}
		System.out.println("---------------");
		printArray(arrayOne);
		System.out.println("---------------");
		printArray(arrayTwo);
		System.out.println("---------------");
		mergeSort(arrayOne, arrayTwo);
	}

	private static void mergeSort(int[] arrayOne, int[] arrayTwo) {
		// TODO Auto-generated method stub
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		merge(arrayOne, arrayTwo);
	}

	private static void merge(int[] arrayOne, int[] arrayTwo) {
		// TODO Auto-generated method stub
		int newLength = arrayOne.length + arrayTwo.length;
		int []sortedArray = new int[newLength];
		int l = 0, r = 0, m = 0;
		while (l < arrayOne.length && r < arrayTwo.length) {
			if (arrayOne[l] == arrayTwo[r]) {
				sortedArray[m] = arrayOne[l];
				sortedArray[m+1] = arrayTwo[r];
				l++;
				r++;
				m++;
			} else if (arrayOne[l] > arrayTwo[r]) {
				sortedArray[m] = arrayTwo[r];
				r++;
			} else if (arrayOne[l] < arrayTwo[r]) {
				sortedArray[m] = arrayOne[l];
				l++;
			}
			m++;
		}
		while (l < arrayOne.length) {
			sortedArray[m] = arrayOne[l];
			m++;
			l++;
		}
		while (r < arrayTwo.length) {
			sortedArray[m] = arrayTwo[r];
			r++;
			m++;
		}
		System.out.println("m is"+m);
		System.out.println("r is"+r);
		System.out.println("l is"+l);
		findMedian(sortedArray);
	}

	private static void findMedian(int[] sortedArray) {
		// TODO Auto-generated method stub
		int midLength = sortedArray.length/2;
		System.out.println("length is "+sortedArray.length);
		System.out.println("Midlen is "+midLength);
		boolean even = sortedArray.length%2==0?true:false;
		printArray(sortedArray);
		if (even) {
			System.out.println("Median is "+sortedArray[midLength-1]+" "+sortedArray[midLength]+" = "+(sortedArray[midLength-1]+sortedArray[midLength])/2);
			return;
		}
		System.out.println("Median is "+sortedArray[midLength-1]+" "+sortedArray[midLength]+" = "+(sortedArray[midLength])/2);
		return;
	}
	private static void printArray(int[] numbers) {
		// TODO Auto-generated method stub
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}

