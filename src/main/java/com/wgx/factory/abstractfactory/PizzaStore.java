package com.wgx.factory.abstractfactory;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author wgx
 * @since 2023/4/13 15:20
 */
public class PizzaStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaFactory factory = getFactory(new BJPizzaFactory());
        while (true) {
            System.out.println("what pizza you want~~~");
            String type = scanner.nextLine();
            Pizza pizza = factory.createPizza(type);
            if (pizza == null) {
                break;
            }
            pizza.prepare();
            pizza.make();
            pizza.cut();
            pizza.box();
            System.out.println("----------------------");
        }
    }

    public static PizzaFactory getFactory(PizzaFactory pizzaFactory) {
        return pizzaFactory;
    }
}
