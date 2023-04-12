package com.wgx.dependenceinversion;

/**
 * @author wgx
 * @since 2023/4/10 17:44
 */
public class DependenceInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Message());
    }
}

interface Receivable {
    void getInfo();
}

class Email implements Receivable {
    @Override
    public void getInfo() {
        System.out.println("email info...");
    }
}

class Message implements Receivable {
    @Override
    public void getInfo() {
        System.out.println("message info...");
    }
}

class Person {
    public void receive(Receivable receivable) {
        receivable.getInfo();
    }
}
