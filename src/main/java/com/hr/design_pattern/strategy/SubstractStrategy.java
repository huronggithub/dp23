package com.hr.design_pattern.strategy;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/20 0020 下午 9:07
 */
public class SubstractStrategy implements Strategy{
    @Override
    public int doCalc(int a, int b) {
        return a-b;
    }
}