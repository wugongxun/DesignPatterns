package com.wgx.proxy.staticproxy;

/**
 * @author wgx
 * @since 2023/4/16 17:24
 */
public class TeacherDaoProxy implements ITeacherDao {
    private TeacherDao target;

    public TeacherDaoProxy(TeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理对象开始代理");
        target.teach();
        System.out.println("授课结束");
    }
}
