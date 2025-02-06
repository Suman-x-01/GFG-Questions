package com.GFG;
/*
Link: https://www.geeksforgeeks.org/problems/rotate-by-90-degree-1587115621/1
 */
public class Anti_ClockwiseRotation {
	public static void main(String[] args) {
		int [][]mat={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		rotateby90(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=============================");
		antiClockwiseRotation(mat);
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void rotateby90(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				swap(matrix,i,j);
			}
		}
	}
	public static void swap(int [][]matrix, int i, int j){
		int temp=matrix[i][j];
		matrix[i][j]=matrix[j][i];
		matrix[j][i]=temp;
	}
	public static void antiClockwiseRotation(int [][]matrix){
		for (int i = 0; i < matrix.length/2; i++) {
			for (int j = 0; j < matrix.length; j++) {
				swap2(matrix,i,j,matrix.length-1-i,j);
			}
		}
	}

	private static void swap2(int[][] matrix, int i, int j,int p, int q) {
		int temp=matrix[i][j];
		matrix[i][j]=matrix[p][q];
		matrix[p][q]=temp;
	}
}
