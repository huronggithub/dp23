package com.hr.design_pattern.builder;

/**
 * @auhor hurong
 * @Date 2020/3/16 0016 下午 21:53
 */
public class CocaCola extends AbsColdDrink {
    @Override
    public float price() {
        return 2.3F;
    }

    @Override
    public void name() {
        System.out.println("可口可乐");
    }
}
