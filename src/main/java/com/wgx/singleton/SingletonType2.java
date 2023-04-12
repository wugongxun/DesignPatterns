package com.wgx.singleton;

/**
 * @author wgx
 * @since 2023/4/11 17:12
 */
public class SingletonType2 {
    public static void main(String[] args) {
        System.out.println(Singleton2.getInstance() == Singleton2.getInstance());
    }
}

class Singleton2 {
    private static Singleton2 instance;
    //构造器私有化
    private Singleton2() {
    }
    static {
        instance = new Singleton2();
    }
    //对外暴露一个静态的公共方法
    public static Singleton2 getInstance() {
        return instance;
    }
}
