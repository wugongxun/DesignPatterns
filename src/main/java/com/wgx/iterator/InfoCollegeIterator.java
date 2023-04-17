package com.wgx.iterator;

import java.util.List;

/**
 * @author wgx
 * @since 2023/4/17 17:42
 */
public class InfoCollegeIterator implements Iterator<Department> {
    private List<Department> departments;
    private int position = 0;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position < departments.size() - 1;
    }

    @Override
    public Department next() {
        return departments.get(position++);
    }

    @Override
    public void remove() {
        departments.remove(position);
    }
}
