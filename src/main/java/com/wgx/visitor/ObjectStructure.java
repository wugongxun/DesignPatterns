package com.wgx.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wgx
 * @since 2023/4/17 16:54
 */
public class ObjectStructure {
    private List<Person> persons = new ArrayList<>();

    public void attach(Person person) {
        persons.add(person);
    }

    public void detach(Person person) {
        persons.remove(person);
    }

    public void display(Action action) {
        persons.forEach(person -> person.accept(action));
    }
}
