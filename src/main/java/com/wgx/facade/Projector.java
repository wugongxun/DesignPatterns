package com.wgx.facade;

/**
 * @author wgx
 * @since 2023/4/16 16:26
 */
public class Projector {
    private Projector() {
        if (instance != null) {
            throw new RuntimeException("对象已经被创建");
        }
    }
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }
    public void on() {
        System.out.println("Projector on...");
    }
    public void off() {
        System.out.println("Projector off...");
    }
    public void play() {
        System.out.println("Projector play...");
    }
    public void pause() {
        System.out.println("Projector pause...");
    }
}
