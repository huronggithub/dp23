package com.hr.design_pattern.builder;

/**
 * @auhor hurong
 * @Date 2020/3/16 0016 下午 21:45
 */
public abstract class AbsColdDrink implements Item{
    @Override
    public Pack packing() {
        return new Bottle();
    }
}
