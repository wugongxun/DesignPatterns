package com.wgx.adapter;

/**
 * @author wgx
 * @since 2023/4/14 16:39
 */
public class Phone {
    public void charging(Voltage5V voltage5V) {
        if (voltage5V.output() <= 5) {
            System.out.println("充电~~~~~");
        } else if (voltage5V.output() > 5) {
            System.out.println("电压过高，无法充电");
        }
    }
}
