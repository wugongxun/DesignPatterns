package com.wgx.factory.abstractfactory;

/**
 * @author wgx
 * @since 2023/4/13 15:18
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Beijing's GreekPizza...");
    }
}
