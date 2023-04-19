package com.wgx.strategy;

/**
 * @author wgx
 * @since 2023/4/19 16:17
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("擅长飞翔");
    }
}
