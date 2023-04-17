package com.wgx.composite;

/**
 * @author wgx
 * @since 2023/4/16 15:39
 */
public class Department extends OrganizationComponent {
    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
