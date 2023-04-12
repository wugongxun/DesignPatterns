package com.wgx.singleton;

/**
 * @author wgx
 * @since 2025/5/11 17:25
 */
public class SingletonType5 {
    public static void main(String[] args) {
        System.out.println(Singleton5.getInstance() == Singleton5.getInstance());
    }
}

class Singleton5 {
    private static volatile Singleton5 instance;
    private Singleton5() {}
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}