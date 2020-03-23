package com.hr.design_pattern.abs_factory;

import com.hr.design_pattern.abs_factory.impl.ColorFactory;
import com.hr.design_pattern.abs_factory.impl.SharpFactory;
import com.hr.design_pattern.factory.ISharp;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/16 0016 下午 1:43
 */
public class AbsFactoryBuilder{

    public IFactory getFactory(String factory) {
        if("color".equals(factory)){
            return new ColorFactory();
        }else  if("sharp".equals(factory)){
            return new SharpFactory();
        }
        return null;
    }

    public static void main(String[] args) {
        AbsFactoryBuilder absFactoryBuilder=new AbsFactoryBuilder();
        IFactory factory = absFactoryBuilder.getFactory("color");
        factory.getColor("red").show();
        factory.getColor("blue").show();

        IFactory sharp = absFactoryBuilder.getFactory("sharp");
        sharp.getSharp("Circle").draw();
        sharp.getSharp("Rectangle").draw();
    }
}