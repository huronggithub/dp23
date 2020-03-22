package com.hr.design_pattern.bridge;

/**
 * @auhor hurong
 * @Date 2020/3/22 0022 下午 18:33
 */
public class Circle  implements Sharp{

    private DrawApi drawApi;

    public Circle(DrawApi drawApi) {
        this.drawApi=drawApi;
    }

    @Override
    public void draw() {
        drawApi.drawSharp(this);
    }
}
