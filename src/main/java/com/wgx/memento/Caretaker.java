package com.wgx.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wgx
 * @since 2023/4/18 16:24
 */
public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
