package com.hr.design_pattern.adapter;

/**
 * @auhor hurong
 * @Date 2020/3/18 0018 下午 22:21
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String file) {
        System.out.println("playing vlc file :"+file);
    }

    @Override
    public void playMp4(String file) {

    }
}
