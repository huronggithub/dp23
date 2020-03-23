package com.hr.design_pattern.flyweight;

import com.hr.design_pattern.flyweight.impl.Circle;
import com.hr.design_pattern.flyweight.impl.Rectangle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/19 0019 下午 4:49
 */
public class SharpFactory {
    Map<String, ISharp> sharps=new HashMap<>();

    public ISharp getSharp(String sharpType){
        return sharps.computeIfAbsent(sharpType, s->s.equalsIgnoreCase("circle")?new Circle():new Rectangle());
    }

    public static void main(String[] args) {
        SharpFactory sharpFactory=new SharpFactory();
        sharpFactory.getSharp("circle").draw();
        sharpFactory.getSharp("circle").draw();
        sharpFactory.getSharp("Rectangle").draw();
        sharpFactory.getSharp("Rectangle").draw();
    }
}