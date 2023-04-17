package com.wgx.template;

/**
 * @author wgx
 * @since 2023/4/17 15:20
 */
public class PeanutSoyaMilk extends SoyaBeanMilk {
    @Override
    void addCondiments() {
        System.out.println("加入花生");
    }
}
