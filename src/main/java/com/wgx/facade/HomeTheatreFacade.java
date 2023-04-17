package com.wgx.facade;

/**
 * @author wgx
 * @since 2023/4/16 16:32
 */
public class HomeTheatreFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheatreFacade() {
        dvdPlayer = DVDPlayer.getInstance();
        projector = Projector.getInstance();
    }

    public void on() {
        dvdPlayer.on();
        projector.on();
    }

    public void off() {
        dvdPlayer.off();
        projector.off();
    }

    public void play() {
        dvdPlayer.play();
        projector.play();
    }

    public void pause() {
        dvdPlayer.pause();
        projector.pause();
    }
}
