package com.wgx.proxy.staticproxy;

/**
 * @author wgx
 * @since 2023/4/16 17:25
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy proxy = new TeacherDaoProxy(new TeacherDao());
        proxy.teach();
    }
}
