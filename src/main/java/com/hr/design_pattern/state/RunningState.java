package com.hr.design_pattern.state;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 7:54
 */
public class RunningState implements State{
    @Override
    public void doAction(Elevator elevator) {
        System.out.println("door closed");
        System.out.println("running...");
        elevator.setState(this);
    }
}