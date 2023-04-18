package com.wgx.mediator;

/**
 * @author wgx
 * @since 2023/4/18 16:03
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "闹钟");
        mediator.register(alarm.getName(), alarm);
        Curtains curtains = new Curtains(mediator, "窗帘");
        mediator.register(curtains.getName(), curtains);
        TV tv = new TV(mediator, "电视");
        mediator.register(tv.getName(), tv);

        alarm.sendMessage(0);
    }
}
