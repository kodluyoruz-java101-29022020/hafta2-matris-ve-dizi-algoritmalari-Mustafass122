package com.kodluyoruz.weektwo;

import java.util.Random;

public class QuestionOne {

	public static void main(String[] args) {		
		
		int[][] myMatris = creatMatris(14,14);
		printMatris(myMatris);
		System.out.println("*******");
		printMatris(transformCells(myMatris));
		
		
	}
	public static int[][] creatMatris(int row, int column){
		int [][] matris = new int[row][column];
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[0].length; j++) {
				Random random = new Random();
				int a = random.nextInt(2);
				matris[i][j] = a;
			}
		}
		return matris;
	}
	public static void printMatris(int[][] matris) {
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[0].length; j++) {
				System.out.print(matris[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static int[][] transformCells(int[][] matrice){
		int[][] outputMatrice = new int[matrice.length][matrice[0].length];

		for (int i = 1; i < matrice.length - 1; i++) {
			for (int j = 1; j < matrice[0].length - 1; j++) {
				int aliveCellCount = 0;
				for (int k = -1; k <= 1; k++) {
					for (int l = -1; l <= 1; ++l) {
						aliveCellCount += matrice[i + k][j + l];
					}
				}
				aliveCellCount -= matrice[i][j];
				if ((matrice[i][j] == 1) && (aliveCellCount < 2)) {
					outputMatrice[i][j] = 0;
				} else if ((matrice[i][j] == 1) && (aliveCellCount > 3)) {
					outputMatrice[i][j] = 0;
				} else if ((matrice[i][j] == 0) && (aliveCellCount == 3)) {
					outputMatrice[i][j] = 1;
				} else {
					outputMatrice[i][j] = matrice[i][j];
				}
			}
		}
		return outputMatrice;
	}
}
