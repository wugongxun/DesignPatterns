package com.wgx.strategy;

/**
 * @author wgx
 * @since 2023/4/19 16:22
 */
public class WildDuck extends Duck {
    public WildDuck() {
        super(new GoodFlyBehavior());
    }

    @Override
    public void info() {
        System.out.println("这是野鸭");
    }
}
