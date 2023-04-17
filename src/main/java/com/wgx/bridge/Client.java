package com.wgx.bridge;

/**
 * @author wgx
 * @since 2023/4/14 22:00
 */
public class Client {
    public static void main(String[] args) {
        FoldedPhone phone = new FoldedPhone(new XiaoMi());
        phone.open();
        phone.close();
        phone.call();
    }
}
