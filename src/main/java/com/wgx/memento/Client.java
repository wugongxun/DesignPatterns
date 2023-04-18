package com.wgx.memento;

/**
 * @author wgx
 * @since 2023/4/18 16:25
 */
public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("状态1");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态3");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前状态:" + originator.getState());
        originator.getStateFromMemento(caretaker.get(2));
        System.out.println("恢复到状态3:" + originator.getState());
    }
}
