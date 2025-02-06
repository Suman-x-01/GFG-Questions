package com.GFG;

import java.util.Arrays;

/*
Link :https://www.geeksforgeeks.org/problems/aggressive-cows/1
 */
public class Aggressive_cows {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 2, 7, 5 };
        int k = 3;
        int i = aggressiveCows(arr, k);
        System.out.println(i);
    }

    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        // if stalls is less than cow then return false
        if (k > stalls.length) {
            return -1;
        }
        Arrays.sort(stalls);
        int start = 1, end = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (findCowMinDistance(stalls, mid, k)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    private static boolean findCowMinDistance(int[] stalls, int mid, int noOfCows) {
        // by default, we put a cow at the first index
        int lastCowStand = stalls[0];
        int cowCount = 1;
        for (int i = 1; i < stalls.length; i++) {
            // check if from the last index where the cow is stand and the current index is
            // greater than the mid
            if (stalls[i] - lastCowStand >= mid) {
                cowCount += 1;
                lastCowStand = stalls[i];
            }
        }
        // if all the cows are put, then return true
        if (cowCount >= noOfCows)
            return true;
        else
            return false;

    }
}
