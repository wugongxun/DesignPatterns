package com.wgx.builder;

/**
 * @author wgx
 * @since 2023/4/14 15:31
 */
public class Client {
    public static void main(String[] args) {
        CommonHouseBuilder builder = new CommonHouseBuilder();
        HouseDirector director = new HouseDirector(builder);
        House house = director.constructHouse();

    }
}
