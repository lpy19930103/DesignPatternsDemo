package com.lipy.Builder;

/**
 * Created by lipy on 2018/1/31.
 */

public class Apple extends Computer {

    @Override
    public void setCPU(int core) {
        super.cpuCoreSize = core;
    }

    @Override
    public void setRAM(int gb) {
        super.ram = gb;
    }

    @Override
    public void setOs(String os) {
        super.os = os;

    }
}
