package com.wgx.command;

/**
 * @author wgx
 * @since 2023/4/17 16:17
 */
public class Client {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        LightReceiver lightReceiver = new LightReceiver();
        remoteController.setCommand(0, new LightOnCommand(lightReceiver), new LightOffCommand(lightReceiver));

        remoteController.onButtonPushed(0);
        remoteController.offButtonPushed(0);
    }
}
