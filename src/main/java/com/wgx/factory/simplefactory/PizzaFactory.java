package com.wgx.factory.simplefactory;

/**
 * @author wgx
 * @since 2023/4/13 15:20
 */
public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("greek");
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }
        return pizza;
    }
}
