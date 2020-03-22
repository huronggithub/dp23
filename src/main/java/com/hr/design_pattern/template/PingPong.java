package com.hr.design_pattern.template;

/**
 * @auhor hurong
 * @Date 2020/3/22 0022 下午 14:49
 */
public class PingPong extends Ball {
    @Override
    public void init() {
        System.out.println("准备球拍和乒乓球，约上三两个好友。");
    }

    @Override
    public void startPlay() {
        System.out.println("发球");
    }

    @Override
    public void endPlay() {
        System.out.println("收拾球拍和球");
    }
}
