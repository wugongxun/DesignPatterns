package com.wgx.adapter;

/**
 * @author wgx
 * @since 2023/4/14 16:37
 */
public class VoltageAdapter implements Voltage5V {
    Voltage220V voltage220V = new Voltage220V();

    @Override
    public int output() {
        int src = voltage220V.output();
        int target = src / 44;
        return target;
    }
}
