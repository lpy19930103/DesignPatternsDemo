package com.lipy.Builder;

/**
 * Created by lipy on 2018/1/31.
 */

public class AppleBuilder extends ComputerBuilder {
    private Computer computer = new Apple();

    @Override
    public AppleBuilder setOS(String os) {
        computer.setOs(os);
        return this;
    }

    @Override
    public AppleBuilder setRam(int gb) {
        computer.setRAM(gb);
        return this;
    }

    @Override
    public AppleBuilder setCpuCore(int coreSize) {
        computer.setCPU(coreSize);
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }

}
