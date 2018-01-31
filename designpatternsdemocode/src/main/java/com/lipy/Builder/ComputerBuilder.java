package com.lipy.Builder;

/**
 * Created by lipy on 2018/1/31.
 */

public abstract class ComputerBuilder {
    public abstract ComputerBuilder setOS(String os);

    public abstract ComputerBuilder setRam(int gb);

    public abstract ComputerBuilder setCpuCore(int coreSize);

    public abstract Computer build();
}
