package com.wgx.memento;

/**
 * @author wgx
 * @since 2023/4/18 16:22
 */
public class Memento {
    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
