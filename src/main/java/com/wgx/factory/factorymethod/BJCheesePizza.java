package com.wgx.factory.factorymethod;

/**
 * @author wgx
 * @since 2023/4/13 15:19
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Beijing's CheesePizza...");
    }
}
