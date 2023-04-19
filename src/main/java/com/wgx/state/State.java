package com.wgx.state;

/**
 * @author wgx
 * @since 2023/4/19 15:28
 */
public interface State {
    void deduceMoney();
    boolean raffle();
    void dispensePrize();
}
