package com.wgx.prototype;

import java.io.Serializable;

/**
 * @author wgx
 * @since 2023/4/13 16:51
 */
public class Sheep implements Cloneable, Serializable {
    public String name;
    public int age;
    public String color;
    public Sheep family;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", family=" + family +
                '}';
    }

    @Override
    protected Sheep clone() {
        Sheep clone = null;
        try {
            //先拷贝基本数据类型
            clone = (Sheep) super.clone();
            //拷贝对象
            if (clone.family != null) {
                clone.family = clone.family.clone();
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
