package com.GFG;

import java.util.ArrayList;
import java.util.List;
/*
Link : https://www.geeksforgeeks.org/problems/rotation4723/1
 */
public class FindKthRotation {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		int rotation = binarySearch(arr);
		System.out.println(rotation);
//		System.out.println(arr.size());
	}

	private static int findRotation(List<Integer> arr) {
		if (arr.isEmpty()) return -1;
		int start = 0, end = arr.size() - 1;
		while (start <= end) {
			int mid=start+(end-start)/2;
			if (arr.get(0) < arr.get(arr.size() - 1)) return 0;
//			[5,6,7,8, 1, 2, 3, 4]
			else {
				int small = binarySearch(arr);

			}
		}
		return 0;
	}
//	Used to find the smallest element
	public static int binarySearch(List<Integer>arr){
		int start=0, end=arr.size()-1;
		if (!arr.isEmpty()){
			while (start<end){
				int mid=start+(end-start)/2;

				if(arr.get(mid)>arr.get(end)){
					start=mid+1;
				}else {
					end=mid;
				}
			}
			return end;
		}else{
			return 0;
		}
	}
}
