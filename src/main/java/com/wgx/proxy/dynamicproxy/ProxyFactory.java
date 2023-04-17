package com.wgx.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author wgx
 * @since 2023/4/16 17:34
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Class<?> aClass = target.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), (proxy, method, args) -> {
            System.out.println("JDK代理开始...");
            Object returnVal = method.invoke(target, args);
            System.out.println("JDK代理结束...");
            return returnVal;
        });
    }
}
