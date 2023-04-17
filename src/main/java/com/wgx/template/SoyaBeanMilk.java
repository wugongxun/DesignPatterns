package com.wgx.template;

/**
 * @author wgx
 * @since 2023/4/17 15:15
 */
public abstract class SoyaBeanMilk {
    final void make() {
        select();
        if (!isPureSoyaMilk()) {
            addCondiments();
        }
        soak();
        beat();
    }

    void select() {
        System.out.println("挑选新鲜的黄豆");
    }

    abstract void addCondiments();

    void soak() {
        System.out.println("浸泡黄豆");
    }

    void beat() {
        System.out.println("将黄豆和配料放入豆浆机，打豆浆");
    }

    //是否为纯豆浆
    boolean isPureSoyaMilk() {
        return false;
    }
}
