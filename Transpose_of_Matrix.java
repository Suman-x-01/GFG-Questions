package com.GFG;

public class Transpose_of_Matrix {
	public static void main(String[] args) {

		int [][]mat={
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4}
		};
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		System.out.println("==========================");
		transpose(4,mat);
	}
	public static void transpose(int n, int mat[][]) {
		for(int i=0;i<mat.length;i++){
			for (int j = 0; j < i; j++) {
				swap(mat,i,j);
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
	public static void swap(int arr[][],int i, int j){
		int temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
	}
}
