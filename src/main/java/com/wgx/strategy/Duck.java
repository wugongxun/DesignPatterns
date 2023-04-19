package com.wgx.strategy;

/**
 * @author wgx
 * @since 2023/4/19 16:18
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;

    public Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void quack() {
        System.out.println("鸭子嘎嘎叫...");
    }

    public void fly() {
        flyBehavior.fly();
    }

    public abstract void info();
}
