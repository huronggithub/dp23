package com.hr.design_pattern.builder;

/**
 * @auhor hurong
 * @Date 2020/3/16 0016 下午 21:51
 */
public class VergBurger extends AbsBurger {
    @Override
    public float price() {
        return 5.3F;
    }

    @Override
    public void name() {
        System.out.println("素食汉堡");
    }
}
