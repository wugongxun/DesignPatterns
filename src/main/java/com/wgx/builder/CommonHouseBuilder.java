package com.wgx.builder;

/**
 * @author wgx
 * @since 2023/4/14 15:23
 */
public class CommonHouseBuilder extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子的地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子的墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
