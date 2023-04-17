package com.wgx.iterator;

/**
 * @author wgx
 * @since 2023/4/17 17:46
 */
public interface College {
    String getName();
    void addDepartment(String name, String desc);
    Iterator createIterator();
}
