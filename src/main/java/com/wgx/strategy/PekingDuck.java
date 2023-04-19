package com.wgx.strategy;

/**
 * @author wgx
 * @since 2023/4/19 16:22
 */
public class PekingDuck extends Duck {
    public PekingDuck() {
        super(new BadFlyBehavior());
    }

    @Override
    public void info() {
        System.out.println("这是北京鸭");
    }
}
