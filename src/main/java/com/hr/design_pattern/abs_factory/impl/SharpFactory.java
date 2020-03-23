package com.hr.design_pattern.abs_factory.impl;

import com.hr.design_pattern.abs_factory.IColor;
import com.hr.design_pattern.abs_factory.IFactory;
import com.hr.design_pattern.factory.ISharp;
import com.hr.design_pattern.factory.impl.Circle;
import com.hr.design_pattern.factory.impl.Rectangle;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/16 0016 下午 1:32
 */
public class SharpFactory implements IFactory {

    @Override
    public ISharp getSharp(String sharp){
        if(sharp.equals(Circle.class.getSimpleName())){
            return new Circle();
        }else if(sharp.equals(Rectangle.class.getSimpleName())){
            return new Rectangle();
        }else{
            return null;
        }
    }

    @Override
    public IColor getColor(String color) {
        return null;
    }
}