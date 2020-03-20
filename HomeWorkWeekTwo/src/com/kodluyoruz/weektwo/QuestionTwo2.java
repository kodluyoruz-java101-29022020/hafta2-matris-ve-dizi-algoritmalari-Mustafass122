package com.kodluyoruz.weektwo;

public class QuestionTwo2 {

	public static void main(String[] args) {

		int[][] myMatris = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
				{ 13, 12, 11, 10, 9 } };
		printMatris(myMatris);
		System.out.print("[");
		System.out.print((myMatris[0][0]) + ",");

		for (int i = 0; i < myMatris.length; i++) {
			for (int j = 0; j < myMatris[0].length; j++) {
				if (myMatris[i][j] == myMatris[0][0] + 1) {
					System.out.print(myMatris[i][j] + ",");
					myMatris[0][0]++;
					i = 0;
					j = 0;
				}
			}
		}
		System.out.print("]");
	}

	public static int[][] printMatris(int[][] matris) {
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[0].length; j++) {
				System.out.print(matris[i][j] + "\t");
			}
			System.out.println();
		}
		return matris;
	}
}
