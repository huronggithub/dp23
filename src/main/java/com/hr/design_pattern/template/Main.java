package com.hr.design_pattern.template;

/**
 * @auhor hurong
 * @Date 2020/3/22 0022 下午 14:53
 */
public class Main {
    public static void main(String[] args) {
        Ball pingPong=new PingPong();
        pingPong.play();

        Ball basketball=new Basketball();
        basketball.play();
    }
}
