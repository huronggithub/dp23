package com.hr.design_pattern.facade;

import com.hr.design_pattern.facade.impl.Circle;
import com.hr.design_pattern.facade.impl.Rectangle;

/**
 * @Description:
 * @Author: hurong
 * @Time: 2020/3/19 0019 下午 4:42
 */
public class Facade {
    ISharp circle;
    ISharp rectangle;

    public Facade() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public void drawCicle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.drawCicle();
        facade.drawRectangle();
    }
}