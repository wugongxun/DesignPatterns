package com.wgx.decorator;

/**
 * @author wgx
 * @since 2023/4/15 14:37
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        super.setDes("巧克力");
        super.setPrice(3F);
    }
}
