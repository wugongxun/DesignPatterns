package com.wgx.observer;

/**
 * @author wgx
 * @since 2023/4/18 14:52
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
