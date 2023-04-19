package com.wgx.state;

/**
 * @author wgx
 * @since 2023/4/19 15:40
 */
public class DispenseState implements State {
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经中奖了，不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("已经中奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0) {
            activity.setCount(activity.getCount() - 1);
            activity.setState(activity.getNoRaffleState());
            System.out.println("发放奖品成功");
        } else {
            System.out.println("奖品已经发发放完");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
