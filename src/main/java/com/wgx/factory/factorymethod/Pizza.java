package com.wgx.factory.factorymethod;

/**
 * @author wgx
 * @since 2023/4/13 15:15
 */
public abstract class Pizza {
    private String name;

    public abstract void prepare();

    public void make() {
        System.out.println("make " + name + " pizza");
    }

    public void cut() {
        System.out.println("cut " + name + " pizza");
    }

    public void box() {
        System.out.println("box " + name + " pizza");
    }

    public void setName(String name) {
        this.name = name;
    }
}
