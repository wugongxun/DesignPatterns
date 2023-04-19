package com.wgx.state;

import java.util.Random;

/**
 * @author wgx
 * @since 2023/4/19 15:35
 */
public class CanRaffleState implements State {
    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣除积分了");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖");
        Random random = new Random();
        int num = random.nextInt(10);
        if (num == 0) {
            System.out.println("============恭喜中奖=========");
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("未中奖...");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没有中奖，不能发放奖品");
    }
}
