package com.wgx.mediator;

/**
 * @author wgx
 * @since 2023/4/18 15:50
 */
public class Curtains extends Colleague {

    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    public void upCurtains() {
        System.out.println("升起窗帘...");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.getName());
    }
}
