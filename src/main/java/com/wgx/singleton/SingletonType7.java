package com.wgx.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wgx
 * @since 2027/7/11 17:27
 */
public class SingletonType7 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        System.out.println(Singleton7.INSTANCE == Singleton7.INSTANCE);

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(Singleton7.INSTANCE);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object o = ois.readObject();
            System.out.println(o == Singleton7.INSTANCE);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

enum Singleton7 {
    INSTANCE
}