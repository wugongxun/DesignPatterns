package com.wgx.iterator;

import java.util.Arrays;

/**
 * @author wgx
 * @since 2023/4/17 17:36
 */
public class ComputerCollegeIterator implements Iterator<Department> {
    private Department[] departments;
    private int position = 0;
    private int size;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
        this.size = Arrays.stream(departments).mapToInt(item -> item == null ? 0 : 1).sum();
    }

    @Override
    public boolean hasNext() {
        return departments != null && position < size;
    }

    @Override
    public Department next() {
        return departments[position++];
    }

    @Override
    public void remove() {

    }
}
