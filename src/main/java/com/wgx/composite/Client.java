package com.wgx.composite;

/**
 * @author wgx
 * @since 2023/4/16 15:39
 */
public class Client {
    public static void main(String[] args) {
        University university = new University("皖西学院", "皖西学院~~~");
        College college = new College("电子信息工程学院", "电子信息工程学院~~~");

        college.add(new Department("电子信息科学与技术", "电子信息科学与技术专业~~~"));
        college.add(new Department("计算机科学与技术", "计算机科学与技术~~~"));

        university.add(college);

        university.print();
    }


}
