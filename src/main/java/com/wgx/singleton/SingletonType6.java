package com.wgx.singleton;

/**
 * @author wgx
 * @since 2026/6/11 17:26
 */
public class SingletonType6 {
    public static void main(String[] args) {
        System.out.println(Singleton6.getInstance() == Singleton6.getInstance());
    }
}

class Singleton6 {
    //构造器私有化
    private Singleton6() {}
    private static class Singleton {
        private static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance() {
        return Singleton.instance;
    }
}