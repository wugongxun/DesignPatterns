package com.wgx.state;

/**
 * @author wgx
 * @since 2023/4/19 15:46
 */
public class Client {
    public static void main(String[] args) {
        RaffleActivity raffleActivity = new RaffleActivity(10);
        for (int i = 0; i < 100; i++) {
            raffleActivity.deduceMoney();
            if (raffleActivity.raffle()) {
                raffleActivity.dispensePrize();
            }
        }
    }
}
