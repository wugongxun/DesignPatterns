package com.wgx.factory.simplefactory;

/**
 * @author wgx
 * @since 2023/4/13 15:18
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare GreekPizza...");
    }
}
