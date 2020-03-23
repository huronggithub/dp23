package com.hr.design_pattern.flyweight.impl;


import com.hr.design_pattern.flyweight.ISharp;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/16 0016 下午 1:29
 */
public class Circle implements ISharp {
    @Override
    public void draw() {
        System.out.println("画圆"+this);
    }
}