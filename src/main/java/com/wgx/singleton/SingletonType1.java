package com.wgx.singleton;

/**
 * @author wgx
 * @since 2023/4/11 17:12
 */
public class SingletonType1 {
    public static void main(String[] args) {
        System.out.println(Singleton1.getInstance() == Singleton1.getInstance());
    }
}

class Singleton1 {
    //构造器私有化
    private Singleton1() {
    }
    //类的内部创建对象
    private final static Singleton1 instance = new Singleton1();
    //对外暴露一个静态的公共方法
    public static Singleton1 getInstance() {
        return instance;
    }
}
