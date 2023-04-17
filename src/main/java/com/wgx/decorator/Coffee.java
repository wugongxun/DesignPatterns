package com.wgx.decorator;

/**
 * @author wgx
 * @since 2023/4/15 14:29
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }

    @Override
    public String getDes() {
        return super.getDes() + super.getPrice() + "$";
    }
}
