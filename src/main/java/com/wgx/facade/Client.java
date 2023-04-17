package com.wgx.facade;

/**
 * @author wgx
 * @since 2023/4/16 16:17
 */
public class Client {
    public static void main(String[] args) {
        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade();
        homeTheatreFacade.on();
        homeTheatreFacade.off();
        homeTheatreFacade.play();
        homeTheatreFacade.pause();
    }
}
