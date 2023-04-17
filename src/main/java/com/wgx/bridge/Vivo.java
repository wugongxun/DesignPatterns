package com.wgx.bridge;

/**
 * @author wgx
 * @since 2023/4/14 21:56
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo手机，开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo手机，关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo手机，打电话");
    }
}
