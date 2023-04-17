package com.wgx.proxy.staticproxy;

/**
 * @author wgx
 * @since 2023/4/16 17:21
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("授课中~~~");
    }
}
