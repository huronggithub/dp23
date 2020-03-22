package com.hr.design_pattern.bridge;

/**
 * @auhor hurong
 * @Date 2020/3/22 0022 下午 18:47
 */
public class Main {

    public static void main(String[] args) {
        Circle greenCircle = new Circle(new GreenDraw());
        Circle blueCircle = new Circle(new BlueDraw());
        greenCircle.draw();
        blueCircle.draw();
    }

}
