package com.al.traversearray;
import java.util.Random;
public class TraverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array2D = new int[4][4];
		Random rand = new Random();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				array2D[i][j] = rand.nextInt(30);
			}
		}
		printArray(array2D);
		minimumPath(array2D);
	}

	private static void printArray(int[][] array2d) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array2d.length; i++) {
			for(int j = 0; j < array2d[0].length; j++) {
				System.out.print(array2d[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static void minimumPath(int [][]array2d) {
		int [][]sums = new int[array2d.length][array2d[0].length];
		sums[0][0] = array2d[0][0];
		for (int i = 1; i < array2d[0].length; i++) {
			sums[0][i] = sums[0][i-1] + array2d[0][i];
		}
		for(int i = 1; i < array2d.length; i++) {
			sums[i][0] = sums[i-1][0] + array2d[i][0];
		}
		for (int i = 1; i < array2d.length; i++) {
			for (int j = 1; j < array2d[0].length; j++) {
				sums[i][j] = array2d[i][j] + Math.min(sums[i-1][j], sums[i][j-1]);
			}
		}
		printArray(sums);
		System.out.println(sums[array2d.length-1][array2d[0].length-1]);
	}

}
