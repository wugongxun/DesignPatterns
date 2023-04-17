package com.wgx.visitor;

/**
 * @author wgx
 * @since 2023/4/17 16:47
 */
public abstract class Person {
    abstract void accept(Action action);
}
