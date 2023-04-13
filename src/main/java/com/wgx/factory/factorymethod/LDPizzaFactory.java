package com.wgx.factory.factorymethod;

/**
 * @author wgx
 * @since 2023/4/13 15:50
 */
public class LDPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new LDGreekPizza();
            pizza.setName("London's greek");
        } else if (type.equals("cheese")) {
            pizza = new LDCheesePizza();
            pizza.setName("London's cheese");
        }
        return pizza;
    }
}
