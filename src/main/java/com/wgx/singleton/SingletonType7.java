package com.wgx.singleton;

/**
 * @author wgx
 * @since 2027/7/11 17:27
 */
public class SingletonType7 {
    public static void main(String[] args) {
        System.out.println(Singleton7.INSTANCE == Singleton7.INSTANCE);
    }
}

enum Singleton7 {
    INSTANCE
}