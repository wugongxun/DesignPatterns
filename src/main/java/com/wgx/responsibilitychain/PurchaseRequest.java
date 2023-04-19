package com.wgx.responsibilitychain;

/**
 * @author wgx
 * @since 2023/4/19 16:41
 */
public class PurchaseRequest {
    private int id;
    private int type = 0;
    private float price;

    public PurchaseRequest(int id, int type, float price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }
}
