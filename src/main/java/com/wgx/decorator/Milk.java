package com.wgx.decorator;

/**
 * @author wgx
 * @since 2023/4/15 14:38
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        super.setDes("牛奶");
        super.setPrice(2F);
    }
}
