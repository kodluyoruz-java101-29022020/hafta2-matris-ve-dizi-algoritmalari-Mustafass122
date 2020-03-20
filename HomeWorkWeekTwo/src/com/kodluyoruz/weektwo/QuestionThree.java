package com.kodluyoruz.weektwo;

import java.util.Random;

public class QuestionThree {

	public static void main(String[] args) {

		int[][] matris11 = new int[3][4];
		int[][] matris1 = fillMatris(matris11);
		int[][] matris22 = new int[4][3];
		int[][] matris2 = fillMatris(matris22);

		int[][] multipMatris = multipilationMAtris(matris1, matris2);
		printMatris(multipMatris);

	}

	public static int[][] multipilationMAtris(int[][] matrisone, int[][] matristwo) {
		int[][] multipMatris = new int[matrisone.length][matristwo[0].length];
		for (int i = 0; i < matrisone.length; i++) {
			for (int j = 0; j < matristwo[0].length; j++) {
				for (int k = 0; k < matrisone[0].length; k++) {
					multipMatris[i][j] += (matrisone[i][k]) * (matristwo[k][j]);
				}
			}
		}
		return multipMatris;
	}

	public static int[][] fillMatris(int[][] matris) {
		Random random = new Random();
		int[][] fillMatris = new int[matris.length][matris[0].length];
		for (int i = 0; i < fillMatris.length; i++) {
			for (int j = 0; j < fillMatris[0].length; j++) {
				fillMatris[i][j] = random.nextInt(10);
			}
		}
		return fillMatris;
	}

	public static void printMatris(int[][] matris) {
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[0].length; j++) {
				System.out.print(matris[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
