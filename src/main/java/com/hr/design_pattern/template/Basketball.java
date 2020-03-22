package com.hr.design_pattern.template;

/**
 * @auhor hurong
 * @Date 2020/3/22 0022 下午 14:49
 */
public class Basketball extends Ball {
    @Override
    public void init() {
        System.out.println("预定篮球场，约人。");
    }

    @Override
    public void startPlay() {
        System.out.println("裁判发指令");
    }

    @Override
    public void endPlay() {
        System.out.println("清理矿泉水瓶，扔到垃圾桶，");
    }
}
