package com.wgx.visitor;

/**
 * @author wgx
 * @since 2023/4/17 16:49
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给出成功评价");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给出成功评价");
    }
}
