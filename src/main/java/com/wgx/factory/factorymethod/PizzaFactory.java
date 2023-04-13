package com.wgx.factory.factorymethod;

/**
 * @author wgx
 * @since 2023/4/13 15:46
 */
public abstract class PizzaFactory {
    public abstract Pizza createPizza(String type);
}
