package com.wgx.observer;

/**
 * @author wgx
 * @since 2023/4/18 14:52
 */
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
