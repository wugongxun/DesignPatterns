package com.wgx.factory.abstractfactory;

/**
 * @author wgx
 * @since 2023/4/13 15:47
 */
public class BJPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new BJGreekPizza();
            pizza.setName("Beijing's greek");
        } else if (type.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setName("Beijing's cheese");
        }
        return pizza;
    }
}
