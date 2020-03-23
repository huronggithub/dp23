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
public class ColorFactory implements IFactory {
    
    @Override
    public ISharp getSharp(String sharp){
        return null;
    }

    @Override
    public IColor getColor(String color) {
        if("red".equals(color)){
            return new RedImpl();
        }else if("green".equals(color)){
            return new GreenImpl();
        }else if("blue".equals(color)){
            return new GreenImpl();
        }else{
            return null;
        }
    }
}