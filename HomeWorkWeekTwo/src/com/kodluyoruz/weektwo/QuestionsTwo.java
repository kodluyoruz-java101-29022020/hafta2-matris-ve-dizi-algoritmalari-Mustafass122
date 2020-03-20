package com.kodluyoruz.weektwo;

import java.util.Arrays;

public class QuestionsTwo {

	public static void main(String[] args) {
		
		int [][] myMatris = {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
		printMatris(myMatris);
		printArray(sortArray(creatArray(myMatris)));
		
	}
	public static int[] creatArray(int[][] matris) {
		int [] arr = new int[(matris.length)*(matris[0].length)];
		int value = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[0].length; j++) {
				arr[value] = matris[i][j];
				if (value < ((matris.length)*(matris[0].length))) {
					value++;
				}				
			}			
		}
		return arr;
	}
	public static int[] sortArray(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	public static int[][] printMatris(int[][] matris){
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[0].length; j++) {
				System.out.print(matris[i][j] + "\t");
			}
			System.out.println();
		}
		return matris;
	}
}
