package com.lipy.facade;

/**
 * 外观模式
 * Created by lipy on 2018/1/31.
 */

public class Test {
    public static void main(String[] args) {
        TvController tvController = new TvController();
        tvController.powerOn();
        tvController.turnDown();
        tvController.next();

    }
}
