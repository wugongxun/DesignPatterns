package com.wgx.visitor;

/**
 * @author wgx
 * @since 2023/4/17 16:49
 */
public class Woman extends Person {
    @Override
    void accept(Action action) {
        action.getWomanResult(this);
    }
}
