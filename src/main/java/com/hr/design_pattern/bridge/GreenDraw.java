package com.hr.design_pattern.bridge;

/**
 * @auhor hurong
 * @Date 2020/3/22 0022 下午 18:45
 */
public class GreenDraw implements DrawApi {
    @Override
    public void drawSharp(Sharp sharp) {
        System.out.println("使用绿色画");
    }
}
