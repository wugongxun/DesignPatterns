package com.wgx.observer;

/**
 * @author wgx
 * @since 2023/4/18 14:55
 */
public class CurrentConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;


    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("当前温度:" + temperature);
        System.out.println("当前气压:" + pressure);
        System.out.println("当前湿度:" + humidity);
    }
}
