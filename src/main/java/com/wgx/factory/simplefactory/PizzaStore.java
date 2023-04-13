package com.wgx.factory.simplefactory;

import java.util.Scanner;

/**
 * @author wgx
 * @since 2023/4/13 15:20
 */
public class PizzaStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("what pizza you want~~~");
            String type = scanner.nextLine();
            Pizza pizza = PizzaFactory.createPizza(type);
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
}
