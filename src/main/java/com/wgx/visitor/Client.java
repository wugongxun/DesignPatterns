package com.wgx.visitor;

/**
 * @author wgx
 * @since 2023/4/17 16:52
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        objectStructure.attach(new Man());

        Success success = new Success();
        objectStructure.display(success);

        System.out.println("========================");

        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
