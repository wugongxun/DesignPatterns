package com.wgx.decorator;

/**
 * @author wgx
 * @since 2023/4/15 14:32
 */
public class Americano extends Coffee {
    public Americano() {
        super.setDes("美式咖啡");
        super.setPrice(15F);
    }
}
