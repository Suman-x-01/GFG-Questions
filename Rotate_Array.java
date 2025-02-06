package com.GFG;

import java.util.LinkedList;
import java.util.Queue;

public class Rotate_Array {
	public static void main(String[] args) {
		int []arr={1,2,3,4,5};
		int rotation=2;
		rotate(arr,rotation);
	}
	public static void rotate(int []arr, int num){
		Queue<Integer> queue = new LinkedList<>();
		for (int i:arr){
			queue.add(i);
		}
//		rotation
		for (int i = 0; i < num; i++) {
			queue.add(queue.remove());
//			queue.add(temp);
		}
		System.out.println(queue);
	}
}
