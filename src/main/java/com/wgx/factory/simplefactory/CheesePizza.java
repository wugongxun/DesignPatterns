package com.wgx.factory.simplefactory;

/**
 * @author wgx
 * @since 2023/4/13 15:19
 */
public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare CheesePizza...");
    }
}
