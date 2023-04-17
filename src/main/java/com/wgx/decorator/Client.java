package com.wgx.decorator;

/**
 * @author wgx
 * @since 2023/4/15 14:39
 */
public class Client {
    public static void main(String[] args) {
        Americano americano = new Americano();
        Milk milk = new Milk(americano);
        Chocolate chocolate = new Chocolate(milk);
        System.out.println(chocolate.cost());
        System.out.println(chocolate.getDes());
    }
}
