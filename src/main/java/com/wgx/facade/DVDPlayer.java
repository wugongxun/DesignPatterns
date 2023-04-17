package com.wgx.facade;

/**
 * @author wgx
 * @since 2023/4/16 16:15
 */
public class DVDPlayer {
    private DVDPlayer() {
        if (instance != null) {
            throw new RuntimeException("对象已经被创建");
        }
    }
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }
    public void on() {
        System.out.println("DVD on...");
    }
    public void off() {
        System.out.println("DVD off...");
    }
    public void play() {
        System.out.println("DVD play...");
    }
    public void pause() {
        System.out.println("DVD pause...");
    }
}
