package com.hr.design_pattern.factory;

import com.hr.design_pattern.factory.impl.Circle;
import com.hr.design_pattern.factory.impl.Rectangle;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/16 0016 下午 1:32
 */
public class SharpFactory {
    public ISharp getSharp(String sharp){
        if(sharp.equals(Circle.class.getSimpleName())){
            return new Circle();
        }else if(sharp.equals(Rectangle.class.getSimpleName())){
            return new Rectangle();
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        SharpFactory sharpFactory=new SharpFactory();
        sharpFactory.getSharp("Circle").draw();
        sharpFactory.getSharp("Rectangle").draw();
    }
}