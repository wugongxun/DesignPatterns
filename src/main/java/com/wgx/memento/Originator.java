package com.wgx.memento;

import com.wgx.mediator.Mediator;

/**
 * @author wgx
 * @since 2023/4/18 16:21
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
