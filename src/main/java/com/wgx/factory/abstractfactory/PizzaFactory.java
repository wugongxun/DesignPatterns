package com.wgx.factory.abstractfactory;

/**
 * @author wgx
 * @since 2023/4/13 15:46
 */
public interface PizzaFactory {
    Pizza createPizza(String type);
}
