package com.wgx.proxy.dynamicproxy;

/**
 * @author wgx
 * @since 2023/4/16 17:34
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中!!!");
    }
}
