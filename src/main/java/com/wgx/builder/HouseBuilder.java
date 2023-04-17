package com.wgx.builder;

/**
 * @author wgx
 * @since 2023/4/14 15:18
 */
public abstract class HouseBuilder {
    protected House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();
    public House build() {
        return house;
    }
}
