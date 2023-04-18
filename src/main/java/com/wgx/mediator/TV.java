package com.wgx.mediator;

/**
 * @author wgx
 * @since 2023/4/18 15:50
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void startTV() {
        System.out.println("开启电视");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }
}
