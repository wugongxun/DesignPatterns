package com.wgx.bridge;

/**
 * @author wgx
 * @since 2023/4/14 21:59
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.println("折叠手机");
        super.open();
    }

    @Override
    public void close() {
        System.out.println("折叠手机");
        super.close();
    }

    @Override
    public void call() {
        System.out.println("折叠手机");
        super.call();
    }
}
