package com.GFG;

public class Median_of_a_row_wise_sorted_matrix {
	public static void main(String[] args) {
int [][]arr={
		{1,2,3},
		{4,5,6},
		{7,8,9},
		{9,10,11}
		};
		int res = median(arr);
		System.out.println(res);
	}
	static int median(int mat[][]) {
		// code here
		int r = mat.length;         // Number of rows
		int c = mat[0].length; //num of column
		int total=r*c;
		int medianIndex=total/2;
		int start=1, end=2000;

		while (start<=end){
			int asumedMedian=start+(end-start)/2;
//			find how many numners are less than asumed median
			int lessValue=findSmallElements(mat, asumedMedian);
			if (lessValue<=medianIndex){
				start=asumedMedian+1;

			}else{
				end=asumedMedian-1;
			}
		}
		return  start;
	}

	private static int findSmallElements(int[][] mat, int asumedMedian) {
		int totalcount=0;
		for (int i = 0; i <mat.length; i++) {
			int start=0,end=mat[i].length-1;
			while (start<=end){
				int mid=start+(end-start)/2;
				if (mat[i][mid]<=asumedMedian){
					start=mid+1;
				}else {
					end=mid-1;
				}
			}
			totalcount +=start;
		}
		return totalcount;
	}
}
