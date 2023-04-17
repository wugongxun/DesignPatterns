package com.wgx.template;

/**
 * @author wgx
 * @since 2023/4/17 15:19
 */
public class RedBeanSoyaMilk extends SoyaBeanMilk {
    @Override
    void addCondiments() {
        System.out.println("加入红豆");
    }
}
