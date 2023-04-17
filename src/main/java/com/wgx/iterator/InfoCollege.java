package com.wgx.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wgx
 * @since 2023/4/17 17:50
 */
public class InfoCollege implements College {
    private List<Department> departments;
    private int size = 0;

    public InfoCollege(int max) {
        departments = new ArrayList<>(max);
    }

    @Override
    public String getName() {
        return "信息学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments.add(new Department(name, desc));
        size++;
    }

    @Override
    public Iterator<Department> createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
