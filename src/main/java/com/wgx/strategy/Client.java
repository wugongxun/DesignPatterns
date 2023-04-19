package com.wgx.strategy;

/**
 * @author wgx
 * @since 2023/4/19 16:23
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.quack();
        wildDuck.fly();
        wildDuck.info();

        System.out.println("==================");

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.quack();
        toyDuck.fly();
        toyDuck.info();
    }
}
