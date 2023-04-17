package com.wgx.adapter;

/**
 * @author wgx
 * @since 2023/4/14 16:35
 */
public class Voltage220V {
    public int output() {
        int src = 220;
        System.out.println("输出电压" + src + "v");
        return src;
    }
}
