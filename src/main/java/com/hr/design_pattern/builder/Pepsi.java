package com.hr.design_pattern.builder;

/**
 * @auhor hurong
 * @Date 2020/3/16 0016 下午 21:53
 */
public class Pepsi extends AbsColdDrink {
    @Override
    public float price() {
        return 2;
    }

    @Override
    public void name() {
        System.out.println("百事可乐");
    }
}
