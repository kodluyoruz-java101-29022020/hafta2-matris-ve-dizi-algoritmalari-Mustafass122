package com.kodluyoruz.weektwo;

import java.util.Arrays;

public class QuestionFour {

	public static void main(String[] args) {

		
		int[] array = creatArray(10);
		printArray(array);	
		System.out.println("Tekrar Eden Sayılar : ");
		SearchArray(array);	
		
	}
	public static void SearchArray(int[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]==array[j])
					System.out.print(array[i]+ " ");
			}
		}
	}
	
	public static int[] creatArray(int length) {		
		int[] array = new int[length];		
		for (int i = 0; i<array.length; i++) {
			array[i] = (int)(Math.random()*10)+1;
		}
		return array;
	}
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
