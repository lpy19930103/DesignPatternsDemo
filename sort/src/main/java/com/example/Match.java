package com.example;

/**
 * Created by Administrator on 2018/2/1.
 */

public class Match {
    static void violentMatch(String bs, String ts) {
        char[] bsc = bs.toCharArray();
        char[] tsc = ts.toCharArray();
        int i = 0;
        int j = 0;
        while (i < bsc.length && j < tsc.length) {
            if (bsc[i] == tsc[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == tsc.length) {
            System.out.print("ts first in bs = " + (i-j));
        } else {
            System.out.print("ts is not in bs");
        }
    }
}
