package com.wgx.iterator;

/**
 * @author wgx
 * @since 2023/4/17 17:34
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
    void remove();
}
