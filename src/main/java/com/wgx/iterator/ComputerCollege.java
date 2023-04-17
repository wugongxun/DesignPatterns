package com.wgx.iterator;

/**
 * @author wgx
 * @since 2023/4/17 17:47
 */
public class ComputerCollege implements College {
    private Department[] departments;
    private int size = 0;

    public ComputerCollege(int max) {
        this.departments = new Department[max];
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments[size++] = new Department(name, desc);
    }

    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
