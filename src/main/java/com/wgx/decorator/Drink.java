package com.wgx.decorator;

/**
 * @author wgx
 * @since 2023/4/15 14:28
 */
public abstract class Drink {
    private String des;
    private float price;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
