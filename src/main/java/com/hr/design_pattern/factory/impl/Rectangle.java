package com.hr.design_pattern.factory.impl;

import com.hr.design_pattern.factory.ISharp;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/16 0016 下午 1:31
 */
public class Rectangle implements ISharp {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}