package com.lipy.Builder;

/**
 * 建造者
 * Created by lipy on 2018/1/31.
 */

public class Test {
    public static void main(String[] args) {
        Computer mac = new AppleBuilder()
                .setCpuCore(1)
                .setRam(5)
                .setOS("mac")
                .build();
        System.out.print(mac.toString());

    }
}
