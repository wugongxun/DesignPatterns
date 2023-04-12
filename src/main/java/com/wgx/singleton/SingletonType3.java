package com.wgx.singleton;

/**
 * @author wgx
 * @since 2023/4/11 17:24
 */
public class SingletonType3 {
    public static void main(String[] args) {
        System.out.println(Singleton3.getInstance() == Singleton3.getInstance());
    }
}

class Singleton3 {
    private static Singleton3 instance;
    private Singleton3() {}
    public synchronized static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}