package com.wgx.strategy;

/**
 * @author wgx
 * @since 2023/4/19 16:17
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("飞翔能力一般");
    }
}
