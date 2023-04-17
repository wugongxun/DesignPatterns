package com.wgx.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wgx
 * @since 2023/4/17 17:54
 */
public class Client {
    public static void main(String[] args) {
        ComputerCollege computerCollege = new ComputerCollege(5);
        computerCollege.addDepartment("计算机科学与技术", "计算机科学与技术");
        computerCollege.addDepartment("软件工程", "软件工程");


        Iterator<Department> iterator = computerCollege.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
