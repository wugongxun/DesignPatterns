package com.wgx.flyweight;

/**
 * @author wgx
 * @since 2023/4/16 17:03
 */
public class ConcreteWebSite extends WebSite {
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println("网站类型为:" + type);
    }
}
