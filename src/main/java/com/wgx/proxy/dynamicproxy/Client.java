package com.wgx.proxy.dynamicproxy;

/**
 * @author wgx
 * @since 2023/4/16 17:39
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new TeacherDao());
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
