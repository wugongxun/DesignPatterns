package com.wgx.strategy;

/**
 * @author wgx
 * @since 2023/4/19 16:18
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不能飞翔");
    }
}
