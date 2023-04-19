package com.wgx.state;

/**
 * @author wgx
 * @since 2023/4/19 15:43
 */
public class DispenseOutState implements State {
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品已经发放完");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品已经发放完");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品已经发放完");
    }
}
