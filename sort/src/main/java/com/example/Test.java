package com.example;

/**
 * Created by Administrator on 2018/1/31.
 */

public class Test {
    private static final int[] NUMBERS =
            {49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};

    private static final String bs = "cbdacefqabcdef abcq";
    private static final String ts = "abc";

    public static void main(String[] args) {
//        Sort.insertSort(NUMBERS);
//        Sort.selectSort(NUMBERS);
//        Sort.bubbleSort(NUMBERS);
        Match.violentMatch(bs, ts);
    }
}
