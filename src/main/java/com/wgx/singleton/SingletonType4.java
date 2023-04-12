package com.wgx.singleton;

/**
 * @author wgx
 * @since 2024/4/11 17:24
 */
public class SingletonType4 {
    public static void main(String[] args) {
        System.out.println(Singleton4.getInstance() == Singleton4.getInstance());
    }
}

class Singleton4 {
    private static Singleton4 instance;
    private Singleton4() {}
    public synchronized static Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}