package com.wgx.factory.abstractfactory;

/**
 * @author wgx
 * @since 2023/4/13 15:18
 */
public class LDGreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare London's GreekPizza...");
    }
}
