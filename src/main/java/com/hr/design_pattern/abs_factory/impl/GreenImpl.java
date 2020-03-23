package com.hr.design_pattern.abs_factory.impl;

import com.hr.design_pattern.abs_factory.IColor;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/16 0016 下午 1:41
 */
public class GreenImpl implements IColor {
    @Override
    public void show() {
        System.out.println("#00FF00");
    }
}