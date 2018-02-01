package com.example;

/**
 * Created by Administrator on 2018/2/1.
 */

public class BinarySearch {

    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int hight = arr.length - 1;
        while (low <= hight) {
            int mid = (low + hight) / 2;
            if (x == arr[mid]) {
                System.out.print("index = " + mid);
                return mid;
            } else if (x < arr[mid]) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
