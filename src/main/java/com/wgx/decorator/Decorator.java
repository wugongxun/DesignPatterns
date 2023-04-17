package com.wgx.decorator;

/**
 * @author wgx
 * @since 2023/4/15 14:33
 */
public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.getDes() + super.getPrice() + "$ " + drink.getDes();
    }
}
