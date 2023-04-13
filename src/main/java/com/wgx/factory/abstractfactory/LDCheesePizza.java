package com.wgx.factory.abstractfactory;

/**
 * @author wgx
 * @since 2023/4/13 15:19
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare London's CheesePizza...");
    }
}
