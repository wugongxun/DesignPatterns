package com.wgx.adapter;

/**
 * @author wgx
 * @since 2023/4/14 16:41
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());

        AbsAdapter adapter = new AbsAdapter() {
            @Override
            public void m1() {
                System.out.println("m1~~~");
            }
        };

        adapter.m1();
    }
}
