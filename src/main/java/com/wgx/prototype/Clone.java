package com.wgx.prototype;

import java.io.*;

/**
 * @author wgx
 * @since 2023/4/13 16:51
 */
public class Clone {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 2, "white");
        sheep.family = new Sheep("jerry", 3, "black");

        try  {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(sheep);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Sheep clone = (Sheep) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        Sheep clone = sheep.clone();
//        System.out.println(sheep);
//        System.out.println(clone);
//        sheep.family.name = "aaa";
//        System.out.println(clone);
//        System.out.println(sheep.family.hashCode());
//        System.out.println(clone.family.hashCode());
    }
}
