package com.wgx.strategy;

/**
 * @author wgx
 * @since 2023/4/19 16:20
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        super(new NoFlyBehavior());
    }

    @Override
    public void info() {
        System.out.println("这是玩具鸭");
    }
}
