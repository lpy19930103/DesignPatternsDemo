package com.lipy.Builder;

/**
 * Created by lipy on 2018/1/31.
 */

public abstract class Computer {
    protected String os;
    protected int ram;
    protected int cpuCoreSize;


    public abstract void setCPU(int core);

    public abstract void setRAM(int gb);

    public abstract void setOs(String os);

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", cpuCoreSize=" + cpuCoreSize +
                '}';
    }
}
