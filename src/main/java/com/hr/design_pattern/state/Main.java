package com.hr.design_pattern.state;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 7:56
 */
public class Main {
    public static void main(String[] args) {
        Elevator elevator=new Elevator();
        State runningState=new RunningState();
        State stopState=new StopState();
        runningState.doAction(elevator);
        System.out.println("state:"+elevator.getState().getClass().getSimpleName());
        stopState.doAction(elevator);
        System.out.println("state:"+elevator.getState().getClass().getSimpleName());
    }
}