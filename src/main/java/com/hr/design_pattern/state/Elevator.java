package com.hr.design_pattern.state;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 7:53
 */
public class Elevator {
    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}