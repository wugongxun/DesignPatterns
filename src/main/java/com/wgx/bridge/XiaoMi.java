package com.wgx.bridge;

/**
 * @author wgx
 * @since 2023/4/14 21:55
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机，开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机，关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机，打电话");
    }
}
