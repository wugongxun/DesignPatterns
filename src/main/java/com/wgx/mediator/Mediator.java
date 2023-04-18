package com.wgx.mediator;

/**
 * @author wgx
 * @since 2023/4/18 15:42
 */
public abstract class Mediator {
    abstract void getMessage(int stateChange, String name);
    abstract void sendMessage();
    abstract void register(String colleagueName, Colleague colleague);
}
